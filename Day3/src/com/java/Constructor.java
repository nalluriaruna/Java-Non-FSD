package com.java;

class Human{
	private int age;
	private String name;
	
	public Human() {
		age=12;
		name="Aruna";
	}
		public int getAge() {
	        return age;
		}
		public String getName() {
	        return name;
	    
	}
}

public class Constructor {
	 public static void main(String args[]) {
		 Human obj = new Human();
		 System.out.println(obj.getAge() + " : " +obj.getName());
		
	}

}
