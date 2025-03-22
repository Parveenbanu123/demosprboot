package com.mph.lc.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
public class College {
	@Value("123")
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "College [id=" + id + "]";
	}
	@PostConstruct
	public void initCollege() {
		System.out.println("College created");
	}
	@PreDestroy
	public void destroyCollege() {
		System.out.println("College Destroyed");
	}
	
}
