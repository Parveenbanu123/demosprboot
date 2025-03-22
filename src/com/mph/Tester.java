package com.mph;

import java.util.ArrayList;
import java.util.Collections;

class A {
	void foo() throws Exception {
		throw new Exception();
	}
}

class SubB2 extends A {
	void foo() {
		System.out.println("B ");
	}
}

public class Tester {

	public static void main(String[] args) throws Exception{
		A a = new SubB2();
		a.foo();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(3);
		Collections.sort(list);
		list.add(2);
		Collections.reverse(list);
		System.out.println(list);// 2 5 3 1
		Integer i=new Integer(1)+new Integer(2);
		switch(i) {
		case 3:
			System.out.println("Three");//Three
			break;
		default:
			System.out.println("Other");
			break;
		}
	}

}
