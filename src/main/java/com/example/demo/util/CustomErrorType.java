package com.example.demo.util;

public class CustomErrorType {
	private String errorMessage;
	
	public CustomErrorType(String errorMessage) {
		super();
		this.setErrorMessage(errorMessage);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
