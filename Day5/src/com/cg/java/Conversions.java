package com.cg.java;

public class Conversions {

		public static void main(String a[]){

		    // program to convert string to integer

		     String s = "245";
		     int result = Integer.parseInt(s);
		     System.out.println("string to integer = " +result);

		    // program to convert   integer to string

		    int b=20;
		    String c = Integer.toString(b);
		    System.out.println("integer to string= " +c);
		    
		 // program to convert double to string

		    double d = 40.6;
		    int i = (int) d;
		    System.out.println("double to integer = "+i);

		   // program to convert a string to a double 

		    String str = "55.63";
		    double f = Double.parseDouble(str);
		    System.out.println("string to double = "+f);

}
}
