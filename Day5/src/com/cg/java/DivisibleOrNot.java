package com.cg.java;
import java.util.Scanner;

public class DivisibleOrNot {
	
  public static void main(String a[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println(" enter a number= ");
	        int n = sc.nextInt();
	        System.out.println(" enter a number which is divisible by= ");
	        int divisible = sc.nextInt();
	      
	            if (n % divisible == 0) {
	                System.out.println(n+" is divisible by " +divisible);
	                
	     
	            }
	            else{
	                System.out.println(n+" is not divisible by "+divisible);
	            }
	      

	    }
	}


