package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.JEmployee;
import com.mph.service.JEmployeeService;
@RestController
@RequestMapping("/employee")
public class JEmployeeController {
	@Autowired
	private JEmployeeService jEmployeeService;
	
	@PostMapping("/addemp")
	public ResponseEntity<?> createEmployee(@RequestBody JEmployee employee){
		int eid=jEmployeeService.addEmployee(employee);
		return ResponseEntity.ok("New Employee "+eid+" created");
	}
	
	@GetMapping("/getallemp")
	public ResponseEntity<List<JEmployee>> getAllEmployee(){
		List<JEmployee> emplist=jEmployeeService.getAllEmployee();
		return ResponseEntity.ok().body(emplist);
	}
	@GetMapping("/getaemp/{id}")
	public ResponseEntity<JEmployee> getAEmployee(@PathVariable int id){
		JEmployee emp=jEmployeeService.getAEmployee(id);
		return ResponseEntity.ok().body(emp);
	}
	
	@PutMapping("/updateemp")
	public void updateEmployee(@RequestBody JEmployee employee){
		jEmployeeService.updateEmployee(employee);
		
	}
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmployee(@PathVariable int id){
		jEmployeeService.deleteEmployee(id);
		
	}
}
