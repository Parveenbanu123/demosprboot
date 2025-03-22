package com.mph;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr; //Declaration
		int[] intArr=new int[3]; //Definition
		intArr[0]=100;
		intArr[1]=200;
		intArr[2]=300;
		
		int[] intArray= {10,20,30,40,50};
		System.out.println(intArr);
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		for(int iarr:intArray) { //Enhanced for-loop
			System.out.println(iarr);
		}
		Employee e1=new Employee(1,"Shiva");
		//e1.setEmpno(1);
		//e1.setEname("Shiva");
		
		Employee e2=new Employee(2,"Ram");
		//e2.setEmpno(2);
		//e2.setEname("Ram");
		
		Employee e3=new Employee(3,"Asha");
		//e3.setEmpno(3);
		//e3.setEname("Asha");
		
		Employee[] empArr= {e1,e2,e3};
		for(Employee earr:empArr) {
			System.out.println(earr);
		}
	}

}
