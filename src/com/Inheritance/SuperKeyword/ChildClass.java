package com.Inheritance.SuperKeyword;

public class ChildClass extends SuperClass {
	public ChildClass() {
		this(10);
		System.out.println("No arg child class constructor");
	}

	public ChildClass(int x) {
		super(x);
		System.out.println("One arg child class constructor");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();

	}
}
