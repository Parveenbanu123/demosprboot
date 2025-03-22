package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mph.dao.HEmployeeDao;
import com.mph.entity.HEmployee;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class HEmployeeServiceImpl implements HEmployeeService{
	
	@Autowired
	HEmployeeDao hEmployeeDao;
	
	
	@Override
	public void createEmployee(HEmployee employee) {
		hEmployeeDao.createEmployee(employee);
		
	}

	@Override
	public List<HEmployee> getAllEmployee() {
		
		return hEmployeeDao.getAllEmployee();
	}

	@Override
	public List<HEmployee> updateEmployee(HEmployee employee) {
		
		return hEmployeeDao.updateEmployee(employee);
	}

	@Override
	public List<HEmployee> deleteEmployee(int eid) {
		
		return hEmployeeDao.deleteEmployee(eid);
	}

	@Override
	public HEmployee getEmployee(int eid) {
		
		return hEmployeeDao.getEmployee(eid);
	}

	@Override
	public HEmployee getEmployeeByEmain(String email) {
		
		return hEmployeeDao.getEmployeeByEmain(email);
	}

}
