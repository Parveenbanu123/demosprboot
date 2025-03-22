package com.mph;

public class Plant {
	private String name;
	public Plant() {
		this("fern");
	}
	public Plant(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
