package com.usecase.employee;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	protected void work() {
		System.out.println("Organization work : ");
	}
}
