package com.mph.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spr-setter.xml");
		//Car c=(Car) context.getBean("car");
		User u=(User) context.getBean("user");
		System.out.println(u.getUserName()+" has a "+u.getCar().getName()+" "+u.getCar().getModel());
	}

}
