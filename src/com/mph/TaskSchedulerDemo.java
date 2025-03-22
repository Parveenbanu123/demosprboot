package com.mph;

class Task extends Thread{
	String taskName;
	public Task() {
		
	}
	public Task(String taskName,int priority) {
		this.taskName=taskName;
		setPriority(priority);
	}
	public void run() {
		System.out.println("Task "+taskName+" started with priortiy "+getPriority());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task completed.");
	}
	
}
public class TaskSchedulerDemo {
	public static void main(String[] args) {
		Task t1=new Task("Task 1",Thread.MAX_PRIORITY);
		Task t2=new Task("Task 2",Thread.MIN_PRIORITY);
		Task t3=new Task("Task 3",Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
 