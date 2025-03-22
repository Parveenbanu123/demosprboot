package com.mph;

public class Pass {

	public static void main(String[] args) {
		int x = 5;
		Pass p = new Pass();
		p.doStuff(x);
		System.out.println("main x=" + x);//5
	}

	void doStuff(int x) {
		System.out.println("doStuff x=" + x++);//5
	}

}
