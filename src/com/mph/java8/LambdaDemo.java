package com.mph.java8;

interface Calculate {// Functional Interface--> contains ONLY ONE abstract method
	public int add(int a, int b);
	public default int sub(int a,int b) {
		return a-b;
	}
	public static void print() {
		System.out.println("Hello");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		Calculate res = (a, b) -> {//Lambda expression
			return a + b;
		};
		System.out.println(res.add(88,12));
		System.out.println(res.sub(88,12));
		Calculate.print();
	}

}
