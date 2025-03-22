package com.mph;

import java.util.Iterator;
import java.util.TreeSet;

class Emp {
	int eno = 349;
	String name = "Sathis";
	public Emp() {
		System.out.println("Emp constructor...");
	}
	public Emp(int eno) {
		this(eno,"Parveen");// Constructor Chaining
		this.eno=eno;
		System.out.println("1.Parameterised constructor...");
	}
	public Emp(int eno,String name) {
		this.eno=eno;
		this.name=name;
		System.out.println("2.Parameterised constructor...");
	}
	public String getEmpDetails() {
		return eno + " " + name;
	}
	public void showId() {
		System.out.println("id");
	}
}

class Manager extends Emp { //IS-A Relationship
	String dept="CSE ";
	public Manager() {
		super(338);
		System.out.println("Manager constructor...");
		
	}
	public String getEmpDetails() {//overridden methods
		//return eno + " " + name+" "+dept;
		return super.getEmpDetails()+" "+dept; // invoking parent class overridden method
	}
}

public class MainClass {

	public static void main(String[] args) {
		Emp e = new Emp();
		System.out.println(e.getEmpDetails());

		Manager m = new Manager();
		System.out.println(m.getEmpDetails());
		
		Emp e1=new Manager();//using polymorphic object we can't call 
		//the managers regular method in general can't call child's regular method
		System.out.println(e1.getEmpDetails());
		e1.showId();
		
		if(e instanceof Emp) {// e is Employee instance
			System.out.println("e is Employee");
		}
		else {
			System.out.println("e is Manager");
		}
		
		if(m instanceof Manager) {// m is both Employee and Manager instance
			System.out.println("m is Manager");//because Manager IS-A Employee
		}
		else {
			System.out.println("m is Employee");
		}
		
		if(e1 instanceof Manager) {//e1 is both Employee and Manager instance
			System.out.println("e1 is Employee");//Because it is Polymorphic object
		}
		else {
			System.out.println("e1 is Manager");
		}
		
		
		Drink one=new Drink();
		Drink two=new Drink();
		Drink three=new Drink();
		one.name="Boost";
		two.name="Tea";
		three.name="Coffee";
		TreeSet set=new TreeSet();
		set.add(one);
		set.add(two);
		set.add(three);
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
