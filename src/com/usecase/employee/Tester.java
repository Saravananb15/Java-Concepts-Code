package com.usecase.employee;

public class Tester extends Employee{
	String[] tools;
	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id,name,dept,salary);
		this.tools= tools;
	}
	@Override
	protected void work() {
		super.work();
		System.out.println("Working on Test case ");
	}
}
