package com.dbs.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value=EmployeeException.class)
	public ResponseEntity<ErrorResponse> handleException(EmployeeException exception) {
		ErrorResponse error=new ErrorResponse();
		error.setErrorMessage("Unable to process request");
		error.setStatusCode(exception.getMessage());
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}

}
