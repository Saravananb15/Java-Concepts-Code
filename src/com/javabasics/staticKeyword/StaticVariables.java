package com.javabasics.staticKeyword;

public class StaticVariables {
	static int val=1;
	public static void main(String[] args) {
		System.out.println("Inside main priniting the val before addition "+val);
		val = val+val;
		System.out.println("Inside main priniting the val after addition "+val);
		staticMethods(val);
	}
	public static void staticMethods(int a) {
		a = a+a;
		System.out.println("inside methods performing addition "+a);
	}
	
	public void methods(int a) {
		a = val +val;
		StaticVariables.staticMethods(a);
	}
}
