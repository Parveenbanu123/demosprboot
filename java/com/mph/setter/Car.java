package com.mph.setter;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	@Value("BMW")
	public String name;
	@Value("M3")
	public String model;
	
	public Car() {
		super();
	}
	public Car(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + "]";
	}

	
}
