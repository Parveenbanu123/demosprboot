package com.mph.spremp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("2001")
	private int eid;
	@Value("Nivetha")
	private String ename;
	@Autowired
	public Salary sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
