package com.mph;

interface TwoWheelers {
	int noofwheels = 4;
	public void move();
}
interface Vehicles{
	void start();
}
class Animal implements TwoWheelers,Vehicles{//Multiple Inheritance via Interface

	@Override
	public void move() {
		
	}

	@Override
	public void start() {
		
	}
}
class Bike implements TwoWheelers {
	@Override
	public void move() {
		System.out.println("Bike Moving...");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		TwoWheelers tw; // Can't Instantiate Interface but object can be created
		Bike bike = new Bike();
		bike.move();
	}
}
