package com.mph;


interface Students{
	public void study();
}
abstract class College implements Students{
	public abstract void fee();
	public void print() {
		System.out.println("From College class");
	}
	public void study() {// not mandatory for implementing abstract methods of interface
		System.out.println("Studying...");// because of abstract class
	}
}
class Engineers implements Students{

	@Override
	public void study() {
		System.out.println("B.E");
	}	
}
class KCE extends College implements Students{

	@Override
	public void fee() {
		System.out.println("Based on the department");
	}

	@Override
	public void study() {
		super.study();// to invoke parent class method because parent class is abstract
		System.out.println("B.E and B.Tech");
	}
}
public class Main{
	public static void main(String[] args) {
		KCE kce=new KCE();
		kce.fee();
		kce.study();
		kce.print();
		Engineers er=new Engineers();
		er.study();
	}
}


