package com.mph.spremp;



import java.sql.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

public class Salary{
	@Value("3000")
	private int sal;
	
	@Value("2025-03-12")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=Date.valueOf(date);
	}
	@Override
	public String toString() {
		return "Salary [sal=" + sal + ", date=" + date + "]";
	}
	
	
}
