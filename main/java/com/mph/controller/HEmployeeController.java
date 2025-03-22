package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.HEmployee;
import com.mph.service.HEmployeeService;

@Controller
public class HEmployeeController {
	HEmployee employee;
	@Autowired
	HEmployeeService hEmployeeService;

	@RequestMapping(value = "/registerpage", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/addEmp", method = RequestMethod.POST)
	public ModelAndView signup(@RequestParam("txtename") String name, @RequestParam("txtemail") String email,
			@RequestParam("txtpass") String pass, @RequestParam("txtgender") String gender) {
		System.out.println(name + " " + email + " " + pass + " " + gender);
		employee = new HEmployee();
		employee.setEname(name);
		employee.setEmail(email);
		employee.setPassword(pass);
		employee.setGender(gender);
		hEmployeeService.createEmployee(employee);
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView editEmp(HEmployee emp) {
		ModelAndView mv=new ModelAndView("edit");
		return mv;
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signin(@RequestParam("txtemail") String email, @RequestParam("txtpass") String pass) {
		HEmployee emp = hEmployeeService.getEmployeeByEmain(email);
		if (emp == null) {
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("NOTIFICATION", "Employee Does not exist");
			return mv;
		} else {
			return allEmployees();
		}
	}
	public ModelAndView allEmployees() {
		List<HEmployee> li=hEmployeeService.getAllEmployee();
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("allemp",li);
		return mv;
	}
	@RequestMapping(value="/updateEmp",method=RequestMethod.POST)
	public ModelAndView updateEmp(@ModelAttribute(name="hEmployee") HEmployee emp,Model model) {
		System.out.println("*************************");
		if(emp.getEid()==0) {
			System.out.println("Employee ID is missing. Update failed");
			ModelAndView mv=new ModelAndView("edit");
			mv.addObject("NOTIFICATION","Employee ID is missing. Cannot update");
			return mv;
		}
		System.out.println("*****************************");
		List<HEmployee>li=hEmployeeService.updateEmployee(emp);
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("allemp",li);
		return mv;
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public ModelAndView deleteEmp(HEmployee emp) {
		List<HEmployee>li=hEmployeeService.deleteEmployee(emp.getEid());
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("allemp",li);
		return mv;
	}

}
