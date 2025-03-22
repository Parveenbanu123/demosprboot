package com.mph;
class ThreadB implements Runnable{
	public void run() {
		System.out.println("Run Starts...");
		for(int i=1;i<=15;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i = "+i);
		}
		System.out.println("Run Ends...");
	}
}
class Thread2 implements Runnable{
	public void run() {
		System.out.println("run.");
		throw new RuntimeException("Problem");
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("Main Starts...");
		ThreadB tb=new ThreadB();
		Thread t=new Thread(tb);
		t.start();
		System.out.println("Main Ends...");
		Thread t2=new Thread(new Thread2());
		t2.start();
		System.out.println("End of main");
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Cat");
			}
		};
		Thread t1=new Thread(r) {
			public void run() {
				System.out.println("Dog");
			}
		};
		t.start();//dog bcaz Runnable doesn't have start
		new Thread(new Runnable() {
			public void run() {
			System.out.print("bar");
			}
		}).start();
	}

}
