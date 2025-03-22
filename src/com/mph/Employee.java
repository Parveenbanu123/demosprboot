package com.mph;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable<Employee>,Serializable{
	private transient int empno;
	private String ename;

	Employee() {
		System.out.println("From Emp Constructor...");
	}

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
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

	public String toString() {
		return empno + " --> " + ename;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empno-o.empno;
	}
	//Anonymous inner-class
	//No such class is there it will be available only for this stmt
//	public static Comparator<Employee> nameComparator=new Comparator<Employee>() {
//		
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			return e1.getEname().compareTo(e2.getEname());
//		}
//	};
	public static Comparator<Employee> nameComparator=Comparator.comparing(Employee::getEname);
	
}
