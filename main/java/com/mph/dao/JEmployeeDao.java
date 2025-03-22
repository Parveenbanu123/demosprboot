package com.mph.dao;

import java.util.List;

import com.mph.entity.JEmployee;

public interface JEmployeeDao {
	public int addEmployee(JEmployee employee);
	public List<JEmployee> getAllEmployee();
	public JEmployee getAEmployee(int id);
	public void updateEmployee(JEmployee employee);
	public void deleteEmployee(int id);
}
