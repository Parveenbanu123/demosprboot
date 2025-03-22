package com.mph;

abstract class Vehicle {

	int noofwheels = 4;
	String fuel;

	Vehicle() {
		System.out.println("Vehicle Constructor...");
	}

	public void start() {
		System.out.println("Starting...");
	}

	public abstract void move();
}

class Bus extends Vehicle {
	@Override
	public void move() {
		System.out.println("Bus Moving");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Vehicle v;//Can't instantiate abstract class but object can be created
		Bus bus = new Bus();
		bus.start();
		bus.move();
	}
}
