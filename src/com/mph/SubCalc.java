package com.mph;

public class SubCalc extends SuperCalc{
//	public static int multiply(int a,int b) {//Error bcaz of line 4 only
//		int c=super.multiply(a,b);//static method can't be overridden
//		return c ;
//	}
	public static void main(String[] args) {
		SubCalc sc=new SubCalc();
		System.out.println(sc.multiply(3,4));
		System.out.println(SubCalc.multiply(2, 2));
	}
}

