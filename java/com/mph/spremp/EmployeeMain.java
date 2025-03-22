package com.mph.spremp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("spr-emp.xml");
		Employee emp=(Employee) context.getBean("employee");
		System.out.println("Employee "+emp.getEname()+" with"
				+ " id "+emp.getEid()+" is earning Salary"
						+ " "+emp.getSal().getSal()+""
								+ " on "+emp.getSal().getDate());
	}

}
