package com.devsphere.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsphere.ems.entity.Employee;
import com.devsphere.ems.service.EmployeeService;

/**
 * @author sohanmathure
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.getEmployeeList();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmployeeUsingQueryParameters(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
}
