package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mph.dao.JEmployeeDao;
import com.mph.entity.JEmployee;

@Service
public class JEmployeeServiceImpl implements JEmployeeService{
	
	@Autowired
	JEmployeeDao jEmployeedao;

	@Override
	public int addEmployee(JEmployee employee) {
		
		return jEmployeedao.addEmployee(employee);
	}

	@Override
	public List<JEmployee> getAllEmployee() {
		
		return jEmployeedao.getAllEmployee();
	}

	@Override
	public JEmployee getAEmployee(int id) {
		
		return jEmployeedao.getAEmployee(id);
	}

	@Override
	public void updateEmployee(JEmployee employee) {
		jEmployeedao.updateEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		jEmployeedao.deleteEmployee(id);
		
	}

}
