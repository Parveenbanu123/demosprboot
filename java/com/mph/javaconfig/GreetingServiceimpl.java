package com.mph.javaconfig;

public class GreetingServiceimpl implements GreetingService{
	
	private String greetMsg;

	public GreetingServiceimpl() {
		super();
	}

	public GreetingServiceimpl(String greetMsg) {
		super();
		this.greetMsg = greetMsg;
	}

	public String getGreetMsg() {
		return greetMsg;
	}

	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}
	public void sayHi() {
		System.out.println("Hi Everyone "+greetMsg);
	}
}
