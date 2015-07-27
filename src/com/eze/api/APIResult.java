package com.eze.api;

public class APIResult {
	
	private String eventType;
	private Status status;
	private String code;
	private String message;
	private PaymentResult paymentResult;
	
	public PaymentResult getPaymentResult() {
		return paymentResult;
	}
	public void setPaymentResult(PaymentResult paymentResult) {
		this.paymentResult = paymentResult;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void setStatus(String status) {
		if (status == Status.SUCCESS.toString()) {
			this.status = Status.SUCCESS;
		} else if (status == Status.FAILURE.toString()) {
			this.status = Status.FAILURE;
		}
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "EzeResult [eventType=" + eventType + ", status=" + status + ", code=" + code + ", message=" + message
				+ ", paymentResult=" + paymentResult + "]";
	}
}
