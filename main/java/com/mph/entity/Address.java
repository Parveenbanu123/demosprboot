package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long addrId;
	public int doorNo;
	public String street;
	public String city;
	@Column(name="zipcode")
	public int pincode;
	
	@ManyToOne
	@JoinColumn(name="EID",referencedColumnName = "id")
	private Employee employee;
	public long getAddrId() {
		return addrId;
	}
	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", doorNo=" + doorNo + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + ", employee=" + employee + "]";
	}
	
	
}
