package com.cg.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample 
{

	public static void main(String args[]) throws  IOException {

		System.out.println("Enter a number");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine());
		System.out.println(num);

}
}