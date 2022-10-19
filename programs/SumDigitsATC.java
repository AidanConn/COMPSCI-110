//**************************
//SumDigitsATC.java
//
//Author: Aidan Connaughton
//Date: 9/13/2022
//Class: COMSC110.02 Lab 2
//Instructor: Dr. Omar
//
//Purpose: Take a four-digit integer and add up the individual digits together.
//**************************
import java.util.Scanner;

public class SumDigitsATC {
    public static void main(String[] args) {
        // Prompt user to input a four-digit integer
        System.out.println("Please enter a four digit number: ");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        // Declare the digit and find it from the input.
        int digit1 = number / 1000;
        int digit2 = (number % 1000) / 100;
        int digit3 = (number % 100) / 10;
        int digit4 = number % 10;

        // Add up the individual digits and output.
        System.out.println(digit1 + digit2 + digit3 + digit4);


    }
}
