package com.mph;
class First{
	int x=30;
	static int y=40;
	static class InnerClass{
		
	}
	public void regularMethod() {
		System.out.println("x="+ ++x);
		System.out.println("y="+ ++y);
	}
	public static void staticMethod() {
		//System.out.println("x="+x);//non-static variable can't be accessed in static method 
		System.out.println("y="+y);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		First s1=new First();
		s1.regularMethod();// 31 41
		s1.regularMethod();// 32 42
		First.staticMethod();// 42
		First s2=new First();
		s2.regularMethod();//31 43
	}

}
