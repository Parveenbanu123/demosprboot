package com.mph.lc.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXML {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spr-lc-xml.xml");
		School sc=(School) context.getBean("school");
		System.out.println("id: "+sc.getId());
		context.registerShutdownHook();
	}

}
