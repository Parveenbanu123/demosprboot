package com.mph.model;

import java.io.Serializable;

public class ParttimeEmployee extends Employee implements Serializable{
	private int workingHr;
	private int workingDay;
	private int salPerHr;
	private Salary sal;
	
	public ParttimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWorkingHr() {
		return workingHr;
	}
	public void setWorkingHr(int workingHr) {
		this.workingHr = workingHr;
	}
	public int getWorkingDay() {
		return workingDay;
	}
	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}
	public int getSalPerHr() {
		return salPerHr;
	}
	public void setSalPerHr(int salPerHr) {
		this.salPerHr = salPerHr;
	}
	public void setSalary() {
		sal.setBasic(salPerHr*workingDay*workingHr);
		super.setSal(sal);
	}
	
	
	@Override
	public String toString() {
		return super.toString();/*+"ParttimeEmployee [workingHr=" + workingHr + ", workingDay=" + workingDay + ", salPerHr=" + salPerHr
				+ "]";*/
	}
	
}
