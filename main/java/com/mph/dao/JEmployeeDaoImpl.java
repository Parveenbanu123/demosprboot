package com.mph.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.mph.entity.JEmployee;

public class JEmployeeDaoImpl implements JEmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_ALL_EMP="select * from jemployee";
	private final String CREATE_EMP="insert into jemployee(name,email,address) values(?,?,?)";
	private final String UPDATE_EMP="update jemployee set name=?,email=?,address=? where id=?";
	private final String DELETE_EMP="delete from jemployee where id=?";
	private final String GET_A_EMP="select * from jemployee where id=?";
	
	
	@Override
	public int addEmployee(JEmployee employee) {
		KeyHolder keyholder=new GeneratedKeyHolder();
		
		jdbcTemplate.update(connection ->{
			PreparedStatement ps=connection.prepareStatement(CREATE_EMP,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,employee.getName());
			ps.setString(2,employee.getEmail());
			ps.setString(3,employee.getAddress());
			return ps;
		},keyholder);
		return keyholder.getKey().intValue();
	}

	@Override
	public List<JEmployee> getAllEmployee() {
		
		return jdbcTemplate.query(SQL_GET_ALL_EMP,new EmployeeRowMapper());
	}

	@Override
	public JEmployee getAEmployee(int id) {
		
		return (JEmployee) jdbcTemplate.queryForObject(GET_A_EMP, new Object[] {id},new BeanPropertyRowMapper(JEmployee.class));
	}

	@Override
	public void updateEmployee(JEmployee employee) {
		jdbcTemplate.update(UPDATE_EMP,employee.getName(),employee.getEmail(),employee.getAddress(),employee.getId());
		System.out.println("Updated successfully");
		
	}

	@Override
	public void deleteEmployee(int id) {
		jdbcTemplate.update(DELETE_EMP,id);
		System.out.println("Deleted Successfully !!!");
		
	}
	
	
	
}
