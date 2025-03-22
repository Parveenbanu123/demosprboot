package com.mph;

class Common{
	int i;
	boolean available=false;
	public synchronized int put(int i) {
		if(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.i=i;
		System.out.println("Put: "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.available=true;
		notify();
		return i;
	}
	public synchronized int get() {
		if(!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get: "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.available=false;
		notify();
		return i;
	}
}
class Producer extends Thread{
	Common c;
	public Producer(Common c) {
		this.c=c;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int x=0,i=0;
		while(x<10) {
		c.put(i++);
		
		x++;
		}
		
	}
}
class Consumer extends Thread{
	Common c;
	public Consumer(Common c) {
		this.c=c;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		int x=0;
		while(x<10) {
		c.get();
		
		x++;
		}
	}
}
public class ProdConsDemo {

	public static void main(String[] args) {
		Common c=new Common();
		new Producer(c);
		new Consumer(c);
		
	}

}
