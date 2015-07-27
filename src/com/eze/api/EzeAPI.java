package com.eze.api;

//import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//import java.net.URLDecoder;
import java.nio.ByteBuffer;
//import java.util.Properties;

import com.eze.exception.APIException;
import com.eze.ezecli.*;
import com.eze.ezecli.ApiInput.MessageType;
import com.eze.ezecli.ApiOutput.EventType;
import com.eze.ezecli.ApiOutput.ResultStatus;
import com.eze.ezecli.LoginInput.LoginMode;
import com.eze.ezecli.TxnInput.TxnType;
import com.google.protobuf.InvalidProtocolBufferException;

public class EzeAPI {

	private InputStream in;
	private OutputStream out;
	private InputStream err;
	private Process p;
	private static EzeAPI API;
	
	private EzeAPI() {
	}
	
	/** 
	 * This method destroys the ezecli exe and gracefully closes the API.
	 */
	public void destroy() {
		if (null != p) {
			try {
				p.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/** 
	 * Method returns the Singleton instance of JavaAPI.
	 * 
	 * @return EzeAPI object
	 */
	public static EzeAPI getInstance() throws Exception {
		
		if (null == API) {
			API = new EzeAPI();
			API.initialize();
		}
		return API;
	}
	
	/**
	 * This method instantiates the Ezecli and setup the input 
	 * and output buffers for reading and writing through protocol buffers.
	 */
	public void initialize() throws APIException {

		try {
			Runtime rt = Runtime.getRuntime();
			if (null != p) {
				p.destroy();
			} 
			p = rt.exec(getEzecliPath());
			in = p.getInputStream();
			out = p.getOutputStream();
			err = p.getErrorStream();
		} catch (Exception e) {
			System.out.println("Err " + e.getMessage());
			e.printStackTrace();
			
			try {
				if (in != null) in.close();
				if (out != null) out.close();
				if (err != null) err.close();
				if (p != null) p.destroy();
			} catch (Exception ex) {
			}
			throw new APIException("Initialize failed. e="+e.getMessage());
		}
	}

	public APIResult login(String userName, String password) throws APIException {
		System.out.println("...Login User <"+userName+":"+password+">");
		
		LoginInput loginInput = LoginInput.newBuilder()
						.setLoginMode(LoginMode.PASSWORD)
						.setUsername(userName)
						.setPasskey(password).build();
		ApiInput apiInput = ApiInput.newBuilder()
						.setMsgType(MessageType.LOGIN)
						.setMsgData(loginInput.toByteString()).build();

		this.send(apiInput);
		APIResult result = null;
	
		while (true) {
			result = this.getResult(this.receive());
			if (result.getEventType() != EventType.LOGIN_RESULT.toString()) continue;
			if ((null != result.getStatus()) && (result.getStatus().toString() == ResultStatus.FAILURE.toString())) {
				throw new APIException("Login failed. "+result.toString());
			}
			break;
		}

		return result;
	}
	
	public void quit() throws APIException {
		this.logout().exit();
	}
	
	private EzeAPI logout() throws APIException {
		System.out.println("...logging out");
		
		ApiInput apiInput = ApiInput.newBuilder()
				.setMsgType(MessageType.LOGOUT)
				.build();

		this.send(apiInput);
		APIResult result = null;
		while (true) {
			result = this.getResult(this.receive());
			if (result.getEventType() != EventType.LOGOUT_RESULT.toString()) continue;
			if ((null != result.getStatus()) && (result.getStatus().toString() == ResultStatus.FAILURE.toString())) {
				throw new APIException("Logout failed. "+result.toString());
			}
			break;
		}
		return this;
	}
		
	private EzeAPI exit() throws APIException {
		System.out.println("...exiting");
		ApiInput apiInput = ApiInput.newBuilder()
				.setMsgType(MessageType.EXIT)
				.build();

		this.send(apiInput);
		APIResult result = null;
		while (true) {
			result = this.getResult(this.receive());
			if (result.getEventType() != EventType.EXIT_RESULT.toString()) continue;
			if ((null != result.getStatus()) && (result.getStatus().toString() == ResultStatus.FAILURE.toString())) {
				throw new APIException("Exit failed. "+result.toString());
			}
			break;
		}
		return this;
	}
	
	public EzeAPI prepareDevice() throws APIException {
		System.out.println("...Preparing Device");
		
		ApiInput apiInput = ApiInput.newBuilder()
				.setMsgType(MessageType.PREPARE_DEVICE)
				.build();

		this.send(apiInput);
		APIResult result = null;
		
		while (true) {
			result = this.getResult(this.receive());
			if (result.getEventType() != EventType.PREPARE_DEVICE_RESULT.toString()) continue;
			if ((null != result.getStatus()) && (result.getStatus().toString() == ResultStatus.FAILURE.toString())) {
				throw new APIException("Prepare device failed. "+result.toString());
			}
			break;
		}
		return this;
	}
	
	public APIResult takePayment(PaymentType type, double amount, PaymentOptions options) throws Exception {
		
		APIResult result = null;
		System.out.println("...Take Payment <"+type.toString()+",amount="+amount+","+">");
		TxnType txnType = null;
		switch(type) {
		case CARD:
			txnType = TxnType.CARD_AUTH;
			break;
		case CASH:
			txnType = TxnType.CASH;
			break;
		case CHEQUE:
			txnType = TxnType.CHEQUE;
			break;
		default:
			txnType = TxnType.CARD_PRE_AUTH;
		}
				
		if (amount <= 0) throw new APIException("Amount is 0 or negative");
		if (txnType == TxnType.CHEQUE) {
			if ((null == options) ||
				(null == options.getChequeNo()) || (options.getChequeNo().isEmpty()) ||
				(null == options.getBankCode()) || (options.getBankCode().isEmpty()) ||
				(null == options.getChequeDate())) {
				throw new APIException("Cheque details not passed for a Cheque transaction");
			}
		}
		
		TxnInput tInput = TxnInput.newBuilder()
				.setTxnType(txnType)
				.setAmount(amount)
				.build();
		
		if (null != options) {
			if (null != options.getOrderId()) tInput = TxnInput.newBuilder(tInput).setOrderId(options.getOrderId()).build();
			if (null != options.getReceiptType()) tInput = TxnInput.newBuilder(tInput).setReceiptType(options.getReceiptType()).build();
			if (null != options.getChequeNo()) tInput = TxnInput.newBuilder(tInput).setChequeNumber(options.getChequeNo()).build();
			if (null != options.getBankCode()) tInput = TxnInput.newBuilder(tInput).setBankCode(options.getBankCode()).build();
			if (null != options.getChequeDate()) tInput = TxnInput.newBuilder(tInput).setChequeDate(options.getChequeDate().toString()).build();
		}
		
		ApiInput apiInput = ApiInput.newBuilder()
				.setMsgType(MessageType.TXN)
				.setMsgData(tInput.toByteString()).build();

		this.send(apiInput);
				
		while (true) {
			result = this.getResult(this.receive());
			if (result.getEventType() != EventType.TXN_RESULT.toString()) continue;
			break;
		}
		return result;
	}

	public APIResult sendReceipt(String txnId, String mobileNo) throws Exception {
		System.err.println("...sendReceipt <"+txnId+">");
		
		ForwardReceiptInput receiptInput = ForwardReceiptInput.newBuilder()
				.setTxnId(txnId)
				.setCustomerMobile(mobileNo).build();
		
		ApiInput apiInput = ApiInput.newBuilder()
				.setMsgType(MessageType.FORWARD_RECEIPT)
				.setMsgData(receiptInput.toByteString()).build();

		this.send(apiInput);
		APIResult result = null;
		while (true) {
			result = this.getResult(this.receive());
			if (result.getEventType() != EventType.FORWARD_RECEIPT_RESULT.toString()) continue;
			break;
		}
		return result;
	}
	
	private APIResult getResult(ApiOutput apiOutput) throws APIException {

		APIResult result = new APIResult();
		
		if (null == apiOutput) throw new APIException("Invalid response from EPIC. ApiOutput is null");

		result.setEventType(apiOutput.getEventType().toString());

		if ((apiOutput.getOutData() != null) && (!apiOutput.getOutData().isEmpty())) {

			result.setStatus(apiOutput.getStatus().toString());
			result.setMessage(apiOutput.getMsgText());
			try {
				StatusInfo statusInfo = StatusInfo.parseFrom(apiOutput.getOutData());
				result.setCode(statusInfo.getCode());
			} catch (InvalidProtocolBufferException e) {
				e.getStackTrace();
			}

			if ((apiOutput.getStatus() == ResultStatus.SUCCESS) && (apiOutput.getEventType().equals(EventType.TXN_RESULT))) {
				
				PaymentResult paymentResult = new PaymentResult();
				Txn txnOutput;
				try {
					txnOutput = Txn.parseFrom(apiOutput.getOutData());

					paymentResult.setPmtType(txnOutput.getTxnType().toString());
					paymentResult.setStatus(txnOutput.getStatus());
					paymentResult.setTxnId(txnOutput.getTransactionId());
					paymentResult.setAmount(txnOutput.getAmount());
					paymentResult.setSettlementStatus(txnOutput.getSettlementStatus());
					paymentResult.setVoidable(txnOutput.getVoidable());
					paymentResult.setChequeNo(txnOutput.getChequeNumber());
					paymentResult.setChequeDate(txnOutput.getChequeDate());
					paymentResult.setAuthCode(txnOutput.getAuthCode());
					paymentResult.setCardType(txnOutput.getCardBrand());
					paymentResult.setOrderId(txnOutput.getOrderId());
					paymentResult.setTid(txnOutput.getTid());
					paymentResult.setMerchantId(txnOutput.getMid());

				} catch (InvalidProtocolBufferException e) {
					throw new APIException("Error reading payment result. ex="+e.getMessage());
				}
				result.setPaymentResult(paymentResult);
			}
		}
		
		//System.out.println(result.toString());
		return result;
	}
	
	private void send(ApiInput apiInput) {
		
		byte[] length = new byte[4];

		try {
			length = intToBytes(apiInput.toByteArray().length);
			out.write(length);
			out.write(apiInput.toByteArray());
			out.flush();
		} catch (InvalidProtocolBufferException e) {
			System.out.println("Parse Error " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error readline " + e.getMessage());
		}
	}

	private ApiOutput receive() {
		
		ApiOutput apiOutput = null;
		byte[] length = new byte[4];

		try {
//			in.read(length);
			this.readWithTimeout(length, 10000);
			int lengthInt = getIntegerFromByte(length);

			if (lengthInt > 0) {
				byte[] data = new byte[lengthInt];
//				in.read(data);
				this.readWithTimeout(data, 10000);
				apiOutput = ApiOutput.parseFrom(data);
			}
		} catch (InvalidProtocolBufferException e) {
			System.out.println("Parse Error " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error readline " + e.getMessage());
		}
		return apiOutput;
	}

	public int readWithTimeout(byte[] data, int timeoutMillis) throws IOException {
		int offset = 0;
		int dataLength = data.length;

		long maxTimeMillis = System.currentTimeMillis() + timeoutMillis;
		while (System.currentTimeMillis() < maxTimeMillis && offset < dataLength) {
			int length = java.lang.Math.min(in.available(), dataLength-offset);
			
			// can alternatively use bufferedReader, guarded by isReady():
			int result = in.read(data, offset, length);
			if (result == -1) break;
			offset += result;
		}
		return offset;
	}
	
	private String getEzecliPath() throws Exception {
//		Properties prop = new Properties();		
//		String propPath = new File(EzeAPI.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
//		String propFile = URLDecoder.decode(propPath+"\\config.properties", "UTF-8");
//	    System.out.println("propFile = " + propFile);
//	    prop.load(new FileInputStream(propFile));
//	    String ezeFile = prop.getProperty("ezecli_path");
//	    return ezeFile;
		return "c:\\program files\\ezetap\\ezecli\\ezecli.exe";
	}
	
	private byte[] intToBytes(final int i) {
		ByteBuffer bb = ByteBuffer.allocate(4);
		bb.putInt(i);
        return reverse(bb.array());
	}

	private static byte[] reverse(byte[] array){
		byte[] reversedArray = new byte[array.length];
        for(int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }
	
	public static int getIntegerFromByte(byte[] byteArr) {
		return (byteArr[3]) << 24 | (byteArr[2] & 0xFF) << 16
				| (byteArr[1] & 0xFF) << 8 | (byteArr[0] & 0xFF);
	}
}
