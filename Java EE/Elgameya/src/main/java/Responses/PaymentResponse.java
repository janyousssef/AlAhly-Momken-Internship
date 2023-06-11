package Responses;

public class PaymentResponse {
private int code;
private Long amount;
private String message;
private String mobileNumber;
public PaymentResponse() {
}
public PaymentResponse(int code, Long amount, String message, String mobileNumber) {
	this.code = code;
	this.amount = amount;
	this.message = message;
	this.mobileNumber = mobileNumber;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public Long getAmount() {
	return amount;
}
public void setAmount(Long amount) {
	this.amount = amount;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

}
