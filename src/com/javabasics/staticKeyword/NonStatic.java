package com.javabasics.staticKeyword;

public class NonStatic {

	NonStatic(){
		System.out.println("Inside Constructor");
	}
	
	{
		System.out.println("Non static Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		System.out.println("First Instane of non static ");
		new NonStatic();
		System.out.println("Second Instance of non static ");
		new NonStatic();
	}
	
	static {
		System.out.println("Inside Static block");
	}

}
