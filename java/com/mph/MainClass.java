package com.mph;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("welcome.xml");
		Welcome w=(Welcome)context.getBean("wel");//Dependency Injection
		System.out.println(w.sayHi());

	}

}
