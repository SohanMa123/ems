package com.devsphere.ems.helper;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.devsphere.ems.entity.Employee;
@Component
public class EmployeeHelper {
	
	List<Employee> employeeList = Arrays.asList(new Employee("Sohan", 1, 100), new Employee("Vipul", 2, 200),
			new Employee("Joe", 3, 300));

	public List<Employee> getAllEmployees() {
		return employeeList;
	}
}
