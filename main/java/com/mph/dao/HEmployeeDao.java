package com.mph.dao;

import java.util.List;

import com.mph.entity.HEmployee;

public interface HEmployeeDao {
	public void createEmployee(HEmployee employee);
	public List<HEmployee> getAllEmployee();
	public List<HEmployee> updateEmployee(HEmployee employee);
	public List<HEmployee> deleteEmployee(int eid);
	public HEmployee getEmployee(int eid);
	public HEmployee getEmployeeByEmain(String email);
}
