package com.javabasics.staticKeyword;

public class StaticMethods {
	public static void main(String[] args) {
		System.out.println("Inside main");
		staticMethods(5);
	}
	public static void staticMethods(int a) {
		a = a+a;
		System.out.println("Inside methods");
		System.out.println("Getting a input and performing a addition "+a);
	}
	
	//invoking a static methods inside a static blocks
	
	static {
		System.out.println("inside static blocks");
		staticMethods(10);
	}
}

