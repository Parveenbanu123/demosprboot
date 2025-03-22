package com.mph.lc.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXML {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spr-lc-anno.xml");
		College col=(College) context.getBean("college");
		System.out.println("id:  "+col.getId());
		context.registerShutdownHook();
	}

}
