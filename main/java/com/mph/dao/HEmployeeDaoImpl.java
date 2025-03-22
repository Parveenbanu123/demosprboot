package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.HEmployee;


@Repository
public class HEmployeeDaoImpl implements HEmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void createEmployee(HEmployee employee) {
		getSession().saveOrUpdate(employee);
		System.out.println("Employee Added Successfully !!!");
		
	}

	@Override
	public List<HEmployee> getAllEmployee() {
		Query qry=getSession().createQuery("from HEmployee");
		List<HEmployee> emplist=qry.list();
		System.out.println("All Employees-- "+emplist);
		return emplist;
	}

	@Override
	public List<HEmployee> updateEmployee(HEmployee employee) {
		Query<HEmployee> qry=getSession().createQuery("update HEmployee set ename=:ename,email=:email,password=:pass,gender=:gender where eid=:eid");
		qry.setParameter("ename", employee.getEname());
		qry.setParameter("email", employee.getEmail());
		qry.setParameter("pass", employee.getPassword());
		qry.setParameter("gender", employee.getGender());
		qry.setParameter("eid", employee.getEid());
		int noofrows=qry.executeUpdate();
		if(noofrows>0) {
			System.out.println("updated "+employee.getEid()+" info");
		}
		return getAllEmployee();
		
	}

	@Override
	public List<HEmployee> deleteEmployee(int eid) {
		Query<HEmployee> qry=getSession().createQuery("delete from HEmployee  where eid=:eid");
		qry.setParameter("eid", eid);
		int noofrows=qry.executeUpdate();
		if(noofrows>0) {
			System.out.println("deleted employee "+eid);
		}
		return getAllEmployee();
	}

	@Override
	public HEmployee getEmployee(int eid) {	
		Query<HEmployee> qry=getSession().createQuery("from HEmployee where eid=:eid");
		qry.setParameter("eid", eid);
		HEmployee emp=qry.uniqueResult();
		System.out.println("Emp fetched using empid: "+emp);
		return emp;
	}

	@Override
	public HEmployee getEmployeeByEmain(String email) {
		Query<HEmployee> qry=getSession().createQuery("from HEmployee where email=:email");
		qry.setParameter("email", email);
		HEmployee emp=qry.uniqueResult();
		System.out.println("Emp fetched using email: "+emp);
		return emp;
	}

}
