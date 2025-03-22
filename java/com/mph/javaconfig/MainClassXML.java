package com.mph.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassXML {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		GreetingService gservice1=(GreetingServiceimpl) context.getBean("gs1");
		gservice1.sayHi();
		System.out.println(gservice1.hashCode());
		GreetingService gservice11=(GreetingServiceimpl) context.getBean("gs1");
		gservice11.sayHi();
		System.out.println(gservice11.hashCode());
		GreetingService gservice2=(GreetingServiceimpl) context.getBean("gs2");
		gservice2.sayHi();
		System.out.println(gservice2.hashCode());
	}

}
