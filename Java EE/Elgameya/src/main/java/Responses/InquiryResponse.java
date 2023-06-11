package Responses;

import java.util.HashMap;

public class InquiryResponse {

	private int status;
	private boolean success;
	HashMap <String,String> data=new HashMap<String,String>();

	public InquiryResponse() {
	}


	public InquiryResponse(int status, boolean success, HashMap<String, String> data) {
		this.status = status;
		this.success = success;
		this.data = data;
	}


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}


	public HashMap<String, String> getData() {
		return data;
	}


	public void setData(HashMap<String, String> data) {
		this.data = data;
	}



}
