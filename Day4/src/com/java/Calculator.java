package com.java;

import java.util.*;

enum Operators{
	addition , substraction , multiplication,division;

}
public class Calculator {
	public static void main(String args[]) {

	int a, b, result=0 ;// Declaring a variables

	Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number value:");
     a = sc.nextInt();

	System.out.print("Enter second number value:");
    b = sc.nextInt();

	Operators O = Operators.substraction;

	switch (O) {

	case addition:
    result=a+b;
    break;

	case substraction:

	result=a-b;
    break;

	case multiplication:

	result=a*b;
    break;

	case division:

	result=a/b;
    break;

	default:
    System.out.println("your operator is not matched");
    break;
}

	System.out.println(a+" "+O+" "+b+": "+result);

	}
	}

	


