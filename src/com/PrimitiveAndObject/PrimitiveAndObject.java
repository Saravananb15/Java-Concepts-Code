package com.PrimitiveAndObject;

public class PrimitiveAndObject {

	public static void main(String[] args) {
		// primitve to object
		int i = 100;
		Integer val = Integer.valueOf(i);
		System.out.println(val);
		// byte to string to object
		byte b = 100;
		String s = Byte.toString(b);
		byte y = Byte.parseByte(s);
		System.out.println(y);
		// object to string
		long x = 1000;
		Long lon = Long.valueOf(x);
		String objtostr = lon.toString();
		Long longstr = Long.valueOf(objtostr);
		System.out.println(longstr);
	}
}
