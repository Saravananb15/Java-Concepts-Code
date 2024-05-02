package com.Inheritance.SuperKeyword;

public class Child extends Parent {
	int c,d;
	Child(int aVal, int bVal,int cVal, int dVal) {
		super(aVal, bVal);
		this.c = cVal;
		this.d = dVal;
//		this.a = cVal;
//		this.b = dVal;
	
	}
	void displayDetails() {
		System.out.println("Parent a and b value : "+ super.a +" "+ super.b);
		System.out.println("Child c and d values : "+this.c + " "+ this.d);
		System.out.println("Child overridden parent values :" + this.a+" "+this.b);
	}
	void f1() {
		super.f1();
		System.out.println("Inside Child");
	}
}
