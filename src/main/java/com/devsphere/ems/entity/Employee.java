package com.devsphere.ems.entity;

public class Employee {
	private String name;
	private Integer id;
	private Integer salary;
	private String mobNo;

	public Employee(String name, Integer id, Integer salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
}
