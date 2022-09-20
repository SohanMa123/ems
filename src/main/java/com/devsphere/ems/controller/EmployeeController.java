package com.devsphere.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsphere.ems.entity.Employee;
import com.devsphere.ems.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.getEmployeeList();
	}
}

