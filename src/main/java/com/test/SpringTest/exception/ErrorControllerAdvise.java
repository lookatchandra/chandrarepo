package com.test.SpringTest.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorControllerAdvise extends ResponseEntityExceptionHandler{

	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(CustomeException.class)
	public ResponseEntity<?> handleException(CustomeException exp) {

		System.out.println("msg :: "+ exp.getErrorMsg());
		return new ResponseEntity<String>("Custome error$$$$$$$$$ :: " + exp.getErrorMsg(), HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>("",HttpStatus.NOT_FOUND);
	}
}
