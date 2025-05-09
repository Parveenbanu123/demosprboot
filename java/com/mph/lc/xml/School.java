package com.mph.lc.xml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class School implements InitializingBean,DisposableBean{
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "School [id=" + id + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy() called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() called");
	}
	
}
