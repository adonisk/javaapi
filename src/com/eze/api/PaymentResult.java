package com.eze.api;

public class PaymentResult {

	private String pmtType;
	private String status;
	private String txnId;
	private double amount;
	private String settlementStatus;
	private boolean voidable;
	private String chequeNo;
	private String chequeDate;
	private String authCode;
	private String cardType;
	private String orderId;
	private String tid;
	private String merchantId;

	public String getPmtType() {
		return pmtType;
	}
	public void setPmtType(String pmtType) {
		this.pmtType = pmtType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getSettlementStatus() {
		return settlementStatus;
	}
	public void setSettlementStatus(String settlementStatus) {
		this.settlementStatus = settlementStatus;
	}
	public boolean getVoidable() {
		return voidable;
	}
	public void setVoidable(boolean voidable) {
		this.voidable = voidable;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	@Override
	public String toString() {
		return "PaymentResult [pmtType=" + pmtType + ", status=" + status + ", txnId=" + txnId + ", amount=" + amount
				+ ", settlementStatus=" + settlementStatus + ", voidable=" + voidable + ", chequeNo=" + chequeNo
				+ ", chequeDate=" + chequeDate + ", authCode=" + authCode + ", cardType=" + cardType + ", orderId="
				+ orderId + ", tid=" + tid + ", merchantId=" + merchantId + "]";
	}
}
