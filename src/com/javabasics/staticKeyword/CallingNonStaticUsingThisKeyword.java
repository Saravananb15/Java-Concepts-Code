package com.javabasics.staticKeyword;

public class CallingNonStaticUsingThisKeyword {
	int x;
	
	CallingNonStaticUsingThisKeyword(){
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		new CallingNonStaticUsingThisKeyword();
		new CallingNonStaticUsingThisKeyword();
	}
}
