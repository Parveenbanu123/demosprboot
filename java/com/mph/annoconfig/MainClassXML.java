package com.mph.annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXML {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spr-annoconfig.xml");
		GreetingService gservice=(GreetingServiceimpl) context.getBean("greetingServiceimpl");
		gservice.sayHi();
		System.out.println(gservice.hashCode());
		GreetingService gservice1=(GreetingServiceimpl) context.getBean("greetingServiceimpl");
		gservice1.sayHi();
		System.out.println(gservice1.hashCode());

	}

}
