package com.mph.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mph.model.Employee;
import com.mph.model.ParttimeEmployee;
import com.mph.util.MyDBConnection;

public class EmployeeDao {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	public void createEmp(ParttimeEmployee emp) {
		con=MyDBConnection.getMyDbConnection();
		try {
			if(emp.getEmptype()==1) {
			ps=con.prepareStatement("insert into memployee(empno,ename,emptype,basic,hra,pf,gross,net) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setInt(3, emp.getEmptype());
			ps.setInt(4,emp.getSal().getBasic());
			ps.setDouble(5, emp.getSal().getHra());
			ps.setDouble(6, emp.getSal().getPf());
			ps.setDouble(7,emp.getSal().getGross());
			ps.setDouble(8, emp.getSal().getNet());
			int noofrows=ps.executeUpdate();
			System.out.println(noofrows+" inserted in DB successfully");
			}
			else {
				ps=con.prepareStatement("insert into memployee(empno,ename,emptype,nohr,noday,salhr,ptsal) values(?,?,?,?,?,?,?)");
				ps.setInt(1, emp.getEmpno());
				ps.setString(2, emp.getEname());
				ps.setInt(3, emp.getEmptype());
				ps.setInt(4,emp.getWorkingHr());
				ps.setInt(5, emp.getWorkingDay());
				ps.setInt(6, emp.getSalPerHr());
				ps.setInt(7, emp.getWorkingHr()*emp.getWorkingDay()*emp.getSalPerHr());
				int noofrows=ps.executeUpdate();
				System.out.println(noofrows+" inserted in DB successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showEmp() {
		//con=MyDBConnection.getMyDbConnection();
		try {
			con=MyDBConnection.getMyDbConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from memployee");
			while(rs.next()) {
				int type=rs.getInt(3);
				if(type==1) {
				System.out.println("EmpNo: "+rs.getInt(1));
				System.out.println("EmpName: "+rs.getString(2));
				System.out.println("EmpType: "+rs.getInt(3));
				System.out.println("Basic: "+rs.getInt(4));
				System.out.println("Hra: "+rs.getDouble(5));
				System.out.println("Pf: "+rs.getDouble(6));
				System.out.println("Gross: "+rs.getDouble(7));
				System.out.println("Net: "+rs.getDouble(8));
				System.out.println("*************************************");
				}
				else if(type==2){
				System.out.println("EmpNo: "+rs.getInt(1));
				System.out.println("EmpName: "+rs.getString(2));
				System.out.println("EmpType: "+rs.getInt(3));
				System.out.println("Working Hour: "+rs.getInt(9));
				System.out.println("Working days: "+rs.getInt(10));
				System.out.println("Salary per hour: "+rs.getInt(11));
				System.out.println("Total Salary: "+rs.getInt(12));
				System.out.println("*************************************");
				}
			}		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	}
	public void resultsetMetaData() {
		con=MyDBConnection.getMyDbConnection();
		ResultSetMetaData rsdata;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from memployee");
			rsdata=rs.getMetaData();
			System.out.println(rsdata.getColumnCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void databaseMetaData() {
		con=MyDBConnection.getMyDbConnection();
		try {
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
