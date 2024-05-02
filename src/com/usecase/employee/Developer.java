package com.usecase.employee;

public class Developer extends Employee{
	String technology;
	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id,name,dept,salary);
		this.technology= technology;
	}
	@Override
	protected void work() {
		super.work();
		System.out.println("Developing a use case in "+ this.dept+" using the technology "+this.technology);
	}
}
