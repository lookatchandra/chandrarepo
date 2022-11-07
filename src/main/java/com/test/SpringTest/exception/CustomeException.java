package com.test.SpringTest.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String errorMsg;

	public CustomeException() {
		super();
	}

	public CustomeException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
		this.errorMsg = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
