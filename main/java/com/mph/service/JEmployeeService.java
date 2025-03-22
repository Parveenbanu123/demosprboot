package com.mph.service;

import java.util.List;

import com.mph.entity.JEmployee;

public interface JEmployeeService {
	public int addEmployee(JEmployee employee);

	public List<JEmployee> getAllEmployee();

	public JEmployee getAEmployee(int id);

	public void updateEmployee(JEmployee employee);

	public void deleteEmployee(int id);
}
