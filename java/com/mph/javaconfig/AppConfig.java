package com.mph.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name="gs1")
	@Scope(value="prototype")
	public GreetingServiceimpl getGs1() {
		GreetingServiceimpl gs=new GreetingServiceimpl();
		gs.setGreetMsg("Have a great day");
		return gs;
	}
	
	@Bean(name="gs2")
	public GreetingServiceimpl getGs2() {
		GreetingServiceimpl gs=new GreetingServiceimpl("Have a wonderful day");
		
		return gs;
	}
}
