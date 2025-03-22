package com.mph.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
	@NamedQuery(name="GET_EMP_BY_ID",query="from Employee e where e.id=:eid")
})
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ename;
	private String email;
	private String password;
	private String gender;
	
	@OneToOne
	@JoinColumn(name="DEPTID")
	private Department deptid;
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Address> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Department getDeptid() {
		return deptid;
	}
	public void setDeptid(Department deptid) {
		this.deptid = deptid;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + id + ", ename=" + ename + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", deptid=" + deptid + ", address=" + address + "]";
	}
	
	
	
}
