package com.example.module8;

        /*
            Author: Edwin Obuya
            Date Created: 3/13/2019
            Date Modified: 3/13/2019
            Description: Introduction to Java
         */

public class MyClass {
    public static void main(String[] args) {

        // Declare variable types
        String vehicle = "Toyota";
        String make = "Corolla";
        String year = "2000";
        String printAccNum = "";
        int accountNumber = 123456;

        String uppercase = "ORACLE";

        String lower = uppercase.toLowerCase();

        System.out.println(uppercase + " " +lower);

        // Convert A Number into a string value
        printAccNum = String.format("You are converting the account number to a string " + accountNumber);
        System.out.println(printAccNum);

    }
}
