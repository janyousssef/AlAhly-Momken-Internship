package Requests;

public class PaymentRequest {
private String mobileNumber;
private long amount;
public PaymentRequest() {
}

public PaymentRequest(String mobileNumber, long amount) {
	this.mobileNumber = mobileNumber;
	this.amount = amount;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public long getAmount() {
	return amount;
}

public void setAmount(long amount) {
	this.amount = amount;
}


}
