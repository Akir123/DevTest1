package com.user.exception;

public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2345676533567643355L;
	    
	public UserNotFoundException() {
		
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
