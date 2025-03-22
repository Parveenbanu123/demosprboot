package com.mph;

public class NewClass {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
			return;
		}
		System.out.println("4");
		System.out.println("5");
	}

}
