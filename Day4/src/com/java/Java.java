package com.java;

public class Java {

    public static void main(String[] args) {
        int numRows = 5;
        int numSpaces = 0;

        for (int i = numRows; i > 0; i--) {
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
        }
    }
}


