package com.mph.demosprboot.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PhoneNumbers {
	private String primaryPhone;
	private String secodaryPhone;
	
	public PhoneNumbers() {
		
	}
	public PhoneNumbers(String primaryPhone, String secodaryPhone) {
		this.primaryPhone = primaryPhone;
		this.secodaryPhone = secodaryPhone;
	}
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	public String getSecodaryPhone() {
		return secodaryPhone;
	}
	public void setSecodaryPhone(String secodaryPhone) {
		this.secodaryPhone = secodaryPhone;
	}
	@Override
	public String toString() {
		return "PhoneNumbers [primaryPhone=" + primaryPhone + ", secodaryPhone=" + secodaryPhone + "]";
	}
	
	
}
