package com.mph;

public class Increment {

	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		do {
			y--;
			++x;
		} while (x < 5);
		System.out.println(x + " " + y);//5 5
	}

}
