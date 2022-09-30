package com.devsphere.ems.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.devsphere.ems.entity.Employee;

@Component
public class EmployeeHelper {

	List<Employee> employeeList = new ArrayList<Employee>() {
		{
			add(new Employee("Vipul", 2, 200));
			add(new Employee("Sohan", 1, 100));
			add(new Employee("Joe", 3, 300));
		}
	};

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee createEmployee(Employee employee) {
		employeeList.add(employee);
		return employee;
	}
}
