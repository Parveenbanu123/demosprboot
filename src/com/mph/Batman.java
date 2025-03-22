package com.mph;

public class Batman {
	int squares=81;
	public static void main(String[] args) {
		new Batman().go();
	}
	void go() {
		incr(++squares);
		System.out.println(squares);//82
	}
	void incr(int squares) {
		squares+=10;//92
	}
}
