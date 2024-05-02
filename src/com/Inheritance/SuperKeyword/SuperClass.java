package com.Inheritance.SuperKeyword;

public class SuperClass {
	int x;
	
	public SuperClass() {
		System.out.println("No arg parent constructor ");
	}
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("one arg parent constructor ");
	}
}
