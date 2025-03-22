package com.mph.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class User {
	@Value("Jessica")
	public String userName;
	@Autowired()
	public Car car;
	
	public User() {
		super();
	}
	public User(String userName, Car car) {
		super();
		this.userName = userName;
		this.car = car;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", car=" + car + "]";
	}
	
}
