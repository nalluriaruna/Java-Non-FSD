package com.cg.java;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String a[]) {
		System.out.println("Enter a number :");
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 System.out.println(num);
  
		sc.close();
	}
	
}