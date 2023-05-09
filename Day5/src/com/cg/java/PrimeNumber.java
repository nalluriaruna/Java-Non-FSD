package com.cg.java;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number = ");
          int n = sc.nextInt(); 
          int i=1;
          int count=0;

    while(i<=n){
        if(n%i == 0){
            count++;
        }
        i++;

    }
if(count==2){
    System.out.println(n+ " is a prime number");
   }
else{
    System.out.println(n+ " is not a prime number");
    }

    }
}

