package com.mph.demosprboot.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class SEmployee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eid;
	private String ename;
	private String email;
	private String password;
	private String gender;
//	@Temporal(TemporalType.DATE)
//	@JsonFormat(pattern="yyyy-MM-dd")
//	private Date dob;
	private boolean isMarried;
//	@Embedded
//	@AttributeOverrides({
//        @AttributeOverride(name = "primaryPhone", column = @Column(name = "primary_phone")),
//        @AttributeOverride(name = "secondaryPhone", column = @Column(name = "secondary_phone"))
//    })
//	private PhoneNumbers phoneNumber;
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
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
	
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
	public boolean getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
//	public PhoneNumbers getPhoneNumber() {
//		return phoneNumber;
//	}
//	public void setPhoneNumber(PhoneNumbers phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
	@Override
	public String toString() {
		return "SEmployee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", isMarried=" + isMarried 
				+ "]";
	}
	
	
	
}
