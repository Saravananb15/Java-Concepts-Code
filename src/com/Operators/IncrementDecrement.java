package com.Operators;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x =10;
		System.out.println("Value of x before pre increment : "+ x);
		//pre increment or decrement
		int y = ++x;
		// post increament or decrement
		int z = x++;
		
		System.out.println("Value of y pre incremented values of : "+ y);
		System.out.println("Value of z post incremented values of : "+ z);
		System.out.println("Value of x after post increment "+ x);
	}
}
