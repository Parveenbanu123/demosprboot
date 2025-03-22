package com.mph;

public class Drink implements Comparable<Drink>{
	public String name;
	public int compareTo(Drink o) {
		return 0;// 0-->means objects are same so only one object is stored
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + "]";
	}
	
}
