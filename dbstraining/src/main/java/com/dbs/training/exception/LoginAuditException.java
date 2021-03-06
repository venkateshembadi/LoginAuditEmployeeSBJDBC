package com.dbs.training.exception;

public class LoginAuditException extends RuntimeException {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String errorMessage;
	
	public LoginAuditException() {
		
	}
	public LoginAuditException(String errorMessage) {
		super(errorMessage);
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
