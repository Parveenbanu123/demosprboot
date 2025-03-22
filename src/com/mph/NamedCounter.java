package com.mph;

public class NamedCounter {
	private final String name;
	private int count;
	public NamedCounter(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public synchronized void increment() {
		count++;
	}
	public synchronized int getCount() {
		return count;
	}
	public synchronized void reset() {
		count=0;//any method share a common variable than 
		       //that method to be synchronized for performing multithreading
	}
}
