package com.mph.model;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable<Employee>,Serializable{
	private int empno;
	private String ename;
	private Salary sal;
	private int emptype;

	public int getEmptype() {
		return emptype;
	}

	public void setEmptype(int emptype) {
		this.emptype = emptype;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
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
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empno-o.empno;
	}
//	public static Comparator<Employee> nameComparator=new Comparator<Employee>() {
//		
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			return e1.getEname().compareTo(e2.getEname());
//		}
//	};
	
	public static Comparator<Employee> nameComparator=Comparator.comparing(Employee::getEname);

}
