package com.mph.java8;

public class MyThread extends Thread{
	public void run() {
		Task t=new Task();
		t.show();
	}
}
