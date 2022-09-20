package com.devsphere.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsphere.ems.entity.Employee;
import com.devsphere.ems.helper.EmployeeHelper;

@Service

public class EmployeeService {
	@Autowired
	EmployeeHelper employeeHelper;

	public List<Employee> getEmployeeList() {
		return employeeHelper.getAllEmployees();
	}

}
