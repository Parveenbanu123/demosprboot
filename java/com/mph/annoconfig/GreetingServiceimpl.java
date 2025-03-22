package com.mph.annoconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceimpl implements GreetingService{
	@Value("Good Noon")
	private String greetMsg;

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
