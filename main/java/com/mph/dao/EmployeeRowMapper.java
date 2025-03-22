package com.mph.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mph.entity.JEmployee;

public class EmployeeRowMapper implements RowMapper<JEmployee> {

	@Override
	public JEmployee mapRow(ResultSet rs, int rowNum) throws SQLException {
		JEmployee emp=new JEmployee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setEmail(rs.getString("email"));
		emp.setAddress(rs.getString("address"));
		return emp;
	}

	

}
