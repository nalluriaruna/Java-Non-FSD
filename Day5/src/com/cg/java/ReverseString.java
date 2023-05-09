package com.cg.java;

public class ReverseString {
	public static void main(String a[]){
	    
	    String name="Aru";
	    int leng=name.length();
	    String rev= " ";
	     
	    for (int i=leng-1;i>=0;i--)
	    {
	         rev=rev+name.charAt(i);
	         
	    }
	 System.out.println("Reverse of " +name+" is "+rev);
	    }

}
