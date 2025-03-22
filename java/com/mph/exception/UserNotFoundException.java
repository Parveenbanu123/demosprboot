package com.mph.exception;

public class UserNotFoundException extends Exception{

	public UserNotFoundException() {
		super();
		System.out.println("User Not Found");
	}

	public UserNotFoundException(String message) {
		super(message);
		System.out.println("User Not Found "+message);
	}

	@Override
	public String toString() {
		return "UserNotFoundException []";
	}
}
