package com.javabasics.staticKeyword;

public class StaticBlocks {
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
	
	
	static {
		System.out.println("Inside static block which will get invoked before"
				+ "main method");
	}
	
	static {
		System.out.println("Static block 2 call hierarchy");
	}
}
