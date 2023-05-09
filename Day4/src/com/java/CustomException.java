package com.java;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String string) {
        super(string);
    }
}

public class CustomException {
	public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative");
            }
            System.out.println("Age is: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}



