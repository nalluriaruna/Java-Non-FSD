package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound{
 public static void main(String[] args) {
   Scanner sc = null;
    try {
	     File file = new File("aru.txt");
	     sc = new Scanner(file);
	      while (sc.hasNextLine()) {
	      String line = sc.nextLine();
	      System.out.println(line);
	     }
	     sc.close();
	     } 
    catch (FileNotFoundException e) {
	       System.out.println("The specified file was not found.");
	        } 
	 }
 }
	







