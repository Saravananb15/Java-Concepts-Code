package com.javabasics.staticKeyword;

public class StaticDemo {
	static StaticDemo obj;
	
	
	static {
		System.out.println(StaticDemo.obj);
		StaticDemo.obj = new StaticDemo();
	}
	
	public static void main(String[] args) {
		System.out.println(StaticDemo.obj);
	}
}
