package com.java;

public class DivideByZero {
	public static void main(String args[]) {
		int i=0,j=0;
	try {
		j=20/i;
	} catch (Exception e) {
		System.out.println("cannot divide by zero." +e);
	}
	System.out.println(j);
	}

}
