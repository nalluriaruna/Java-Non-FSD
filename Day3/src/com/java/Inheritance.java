package com.java;

 class Animal {
    public void speak() {
        System.out.println("The animal speaks");
    }
}

 class Dog extends Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}
public class Inheritance{
	public static void main(String args[]) {


Dog dog = new Dog();

dog.speak();
	}
}
