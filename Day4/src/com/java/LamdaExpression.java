package com.java;

 interface A{

	int add(int i,int j);
 }	
		
	
public class LamdaExpression {
	public static void main(String args[]) {
	
		A obj=  (i,j) -> i+j;	

   int result = obj.add(6, 8);
   System.out.println(result);

};
}
