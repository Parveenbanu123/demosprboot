package com.mph.controller;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mph.entity.Address;
import com.mph.entity.Department;
import com.mph.entity.Employee;

public class EmployeeController {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction txn;
	Employee emp;
	Department dept;
	Address addr;
	Scanner sc=new Scanner(System.in);
	public void addEmployee() {
		txn=session.beginTransaction();
		emp=new Employee();
		dept=new Department();
		addr=new Address();
//		System.out.println("Enter emp id:");
//		int id=sc.nextInt();
//		emp.setId(id);
		
		System.out.println("Enter emp name:");
		String name=sc.next();
		emp.setEname(name);
		
		System.out.println("Enter emp email:");
		String email=sc.next();
		emp.setEmail(email);
		
		System.out.println("Enter password:");
		String password=sc.next();
		emp.setPassword(password);
		
		System.out.println("Enter emp gender:");
		String gender=sc.next();
		emp.setGender(gender);
		
		
//		System.out.println("Enter dept id:");
//		int did=sc.nextInt();
//		dept.setDid(did);
		
		System.out.println("Enter dept name:");
		String dname=sc.next();
		dept.setDname(dname);
		
//		System.out.println("Enter Address id:");
//		long addrid=sc.nextLong();
//		addr.setAddrId(addrid);
		
		System.out.println("Enter Door No:");
		int doorno=sc.nextInt();
		addr.setDoorNo(doorno);
		
		System.out.println("Enter Street :");
		String street=sc.next();
		addr.setStreet(street);
		
		System.out.println("Enter City :");
		String city=sc.next();
		addr.setCity(city);
		
		System.out.println("Enter PinCode :");
		int pincode=sc.nextInt();
		addr.setPincode(pincode);
		
		List<Address> adlist=new ArrayList<>();
		adlist.add(addr);
		addr.setEmployee(emp);
		emp.setAddress(adlist);
		session.save(addr);
		session.save(dept);
		emp.setDeptid(dept);
		
		session.save(emp);
		
		txn.commit();
		System.out.println("Employee created successfully!!!");
	}
	public void viewEmployee() {
		session.clear();
		Query q=session.createQuery("from Employee");
		List<Employee> emplist=q.list();
		Iterator itr=emplist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void getEmpById() {
		System.out.println("Enter employee id to search:");
		int eid=sc.nextInt();
		Query q=session.createNamedQuery("GET_EMP_BY_ID").setInteger("eid", eid);
		Employee emp=(Employee) q.uniqueResult();
		System.out.println(emp);
	}
	public void searchByEmail() {
		System.out.println("Enter email to serach:");
		String email=sc.next();
		Criteria c=session.createCriteria(Employee.class);
		c.add(Restrictions.eq("email", email));
		Employee emp=(Employee)c.uniqueResult();
		System.out.println(emp);
	}
	public void searchByName() {
		System.out.println("Enter name to serach:");
		String ename=sc.next();
		String sqlQuery = "SELECT * FROM Employee WHERE ename = ?"; 
		SQLQuery query = session.createNativeQuery(sqlQuery);
		query.setParameter(1, ename);
		query.executeUpdate();
		Employee empl = (Employee) query.uniqueResult();
		System.out.println(empl);
		

	}
}
