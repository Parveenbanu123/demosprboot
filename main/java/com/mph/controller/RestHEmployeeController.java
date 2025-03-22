package com.mph.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.HEmployee;
import com.mph.service.HEmployeeService;
@RestController
@RequestMapping("/hemployee")
public class RestHEmployeeController {
	HEmployeeService hEmployeeService;
	@GetMapping("/hi")
	public String sayHi(){
		return "HIII";
	}
	@GetMapping("/allempl")
	public ResponseEntity<List<HEmployee>> listAllEmployees(){
		List<HEmployee> li=hEmployeeService.getAllEmployee();
		if(li.isEmpty()) {
			return new ResponseEntity<List<HEmployee>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HEmployee>>(li,HttpStatus.OK);
	}
	@PostMapping("/createEmp")
	public HEmployee createEmployee(@RequestBody HEmployee emp) {
		hEmployeeService.createEmployee(emp);
		return emp;
	}
	@DeleteMapping("/deleteById/{eid}")
	public ResponseEntity<List<HEmployee>> deleteEmployee(@PathVariable("eid") int id){
		List<HEmployee> li=hEmployeeService.deleteEmployee(id);
		if(li.isEmpty()) {
			return new ResponseEntity<List<HEmployee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HEmployee>>(li,HttpStatus.OK);
	}
}
