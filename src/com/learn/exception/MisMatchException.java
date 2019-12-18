package com.learn.exception;

public class MisMatchException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6843728481561407394L;
	private String errorcode;
	
	private String message;

	public MisMatchException(String errorcode,String message)
	{
		this.errorcode=errorcode;
		this.message=message;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
