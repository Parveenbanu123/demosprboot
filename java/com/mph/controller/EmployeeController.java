package com.mph.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mph.dao.EmployeeDao;
import com.mph.model.Employee;
import com.mph.model.ParttimeEmployee;
import com.mph.model.Salary;

public class EmployeeController {
	Employee emp;
	Salary sal;
	ParttimeEmployee part;
	EmployeeDao ed=new EmployeeDao();
	Scanner sc = new Scanner(System.in);
	List list=new ArrayList();
	public void addEmp() {
		emp = new Employee();
		sal = new Salary();
		part =new ParttimeEmployee();
		System.out.println("Enter type of Employee:");
		System.out.println("1-->FullTime");
		System.out.println("2-->PartTime");
		int emptype=sc.nextInt();
		sal.setEmptype(emptype);
		part.setEmptype(emptype);
		if(emptype==1) 
		{
			System.out.println("Enter Empno:");
			int eno = sc.nextInt();
			part.setEmpno(eno);

			System.out.println("Enter Ename:");
			String ename = sc.next();
			part.setEname(ename);

			System.out.println("Enter basic:");
			int basic = sc.nextInt();
			sal.setBasic(basic);
			sal.setHra();
			sal.setPf();
			sal.setGross();
			sal.setNet();
			part.setSal(sal);
			ed.createEmp(part);
			System.out.println("Employee Added...");
		}
		else {
			System.out.println("Enter Empno:");
			int eno = sc.nextInt();
			part.setEmpno(eno);

			System.out.println("Enter Ename:");
			String ename = sc.next();
			part.setEname(ename);
			
			System.out.println("Enter ur Working Hour:");
			int workinghr=sc.nextInt();
			part.setWorkingHr(workinghr);
			System.out.println("Enter ur Working Day:");
			int workingday=sc.nextInt();
			part.setWorkingDay(workingday);
			System.out.println("Enter ur Salary per hr:");
			int salperhr=sc.nextInt();
			part.setSalPerHr(salperhr);
			int total=workinghr*workingday*salperhr;
			sal.setPtsal(total);
			part.setSal(sal);
			ed.createEmp(part);
			}
		if(emp.getEmptype()==1) {
			list.add(emp);
		}
		else {
			list.add(part);
		}
	}
	public void serializeEmp() {
		try {
			FileOutputStream fos = new FileOutputStream("emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//Employee emp = new Employee();
			if(emp.getEmptype()==1) {
				oos.writeObject(emp);
			}
			else {
				oos.writeObject(part);
			}
			System.out.println("Serialized...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void deserializeEmp() {
		try (FileInputStream fis = new FileInputStream("emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);){//try with resources
			
			Employee em = (Employee) ois.readObject();
			//System.out.println(em.getEmpno() + " " + em.getEname());
			System.out.println(em);
		} catch (FileNotFoundException | ClassNotFoundException e) {//multi catch
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public void viewEmp() {
		//Collections.sort(list);
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		list.forEach(System.out::println);
		ed.showEmp();
	}

	public void addEmpToArray() {
		System.out.println("Enter how many employees need to add:");
		int num = sc.nextInt();
		Employee[] empArr = new Employee[num];
		for (int i = 0; i < num; i++) {
			emp = new Employee();
			System.out.println("Enter eno:");
			int no = sc.nextInt();
			emp.setEmpno(no);
			System.out.println("Enter ename:");
			String name = sc.next();
			emp.setEname(name);
			empArr[i] = emp;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(empArr[i]);
		}
	}
	public void sortEmpByNumber() {
		Collections.sort(list);
		System.out.println("Sorted based on EmpNumber");
	}
	public void sortEmpByName() {
		Collections.sort(list, Employee.nameComparator);
		System.out.println("Sorted based on EmpName");
	}
	public void getResultsetMetaData() {
		ed.resultsetMetaData();
	}
	public void getDatabaseMetaData() {
		ed.databaseMetaData();
	}
}
