package com.eze.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentOptions {
	String orderId;
	String receiptType;
	String chequeNo;
	String bankCode;
	Date chequeDate;
	
	public static PaymentOptions build() {
		return new PaymentOptions();
	}

	public String getOrderId() {
		return orderId;
	}
	public PaymentOptions setOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}
	public String getReceiptType() {
		return receiptType;
	}
	public PaymentOptions setReceiptType(String receiptType) {
		this.receiptType = receiptType;
		return this;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public PaymentOptions setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
		return this;
	}
	public String getBankCode() {
		return bankCode;
	}
	public PaymentOptions setBankCode(String bankCode) {
		this.bankCode = bankCode;
		return this;
	}
	public Date getChequeDate() {
		return chequeDate;
	}
	public String getChequeDateAsString() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(this.chequeDate);
	}
	public PaymentOptions setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
		return this;
	}
	
	public String toString() {
		return "orderId=" + this.orderId 
				+ ", receiptType=" + this.receiptType 
				+ ", chequeNo=" + this.chequeNo
				+ ", bankName=" + this.bankCode 
				+ ", chequeDate=" + this.chequeDate;
	}
}
