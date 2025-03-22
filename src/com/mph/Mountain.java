package com.mph;
class Atom{
	Atom(){
		System.out.println("atom");
	}
}
class Rock extends Atom{
	Rock(String type){//super() will be called by JVM automatically
		System.out.println(type);
	}
}
public class Mountain extends Rock {
	Mountain(){
		super("granite");
		new Rock("granite");
	}
	public static void main(String[] args) {
		new Mountain();
	}
}
// atom
// granite
// atom
// granite
