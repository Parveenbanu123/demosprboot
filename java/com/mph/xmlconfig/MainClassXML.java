package com.mph.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXML {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spr-xmlconfig.xml");
		GreetingService gservice1=(GreetingServiceimpl) context.getBean("gs");
		gservice1.sayHi();
		System.out.println(gservice1.hashCode());
		GreetingService gservice2=(GreetingServiceimpl) context.getBean("gs");
		gservice2.sayHi();
		System.out.println(gservice2.hashCode());
	}

}
