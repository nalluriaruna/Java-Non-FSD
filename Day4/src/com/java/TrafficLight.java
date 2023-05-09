package com.java;

enum Light {
	  Red, Yellow , Green;
}

public class TrafficLight {
	public static void main(String[] args) {
		 
		Light L = Light.Green;
		
		if(L== Light.Red)
			System.out.println("you must STOP");
		else if (L ==Light.Yellow)
			System.out.println("SLOW DOWN and wait");
		else
			System.out.println("you can GO");
			
		
	}

}
