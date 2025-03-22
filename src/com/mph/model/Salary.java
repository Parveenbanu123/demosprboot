package com.mph.model;

import java.io.Serializable;

// POJO Class--> Plain Old Java Object
public class Salary implements Serializable{//HAS-A Relationship--> Employee HAS-A Salary
	private int ptsal;
	private int basic;
	private double hra;
	private double pf;
	private double gross;
	private double net;
	private int emptype;
	public Salary() {
		super();
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra() {
		this.hra = basic * 0.1;
	}

	public double getPf() {
		return pf;
	}

	public void setPf() {
		this.pf = basic * 0.05;
	}

	public double getGross() {
		return gross;
	}

	public void setGross() {
		this.gross = basic + hra + pf;
	}

	public double getNet() {
		return net;
	}

	public void setNet() {
		this.net = gross - pf;
	}
	
	public int getEmptype() {
		return emptype;
	}

	public void setEmptype(int emptype) {
		this.emptype = emptype;
	}
	public int getPtsal() {
		return ptsal;
	}

	public void setPtsal(int ptsal) {
		this.ptsal = ptsal;
	}

	@Override
	public String toString() {
		if(this.emptype==1) {
		return "Salary [basic=" + basic + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
		}
		else {
			return "Salary="+ptsal;
		}
	}


}
