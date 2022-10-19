//**************************
//PalindromeTestATC.java
//
//Author: Aidan Connaughton
//Date: 10/4/2022
//Class: COMSC110 LAB
//Instructor: Dr. Omar
//
//Purpose: This program takes in a 5 digit integer and determines if it is a palindrome.
//**************************

import java.util.Scanner;

public class PalindromeTestATC {
    public static void main(String[] args){
        //Step 1: Input the 5 digit integer

        //Vars
        int number = 0;

        System.out.println("Please enter a 5 digit integer: ");
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        //Step 2: Check if the number is a palindrome

        String testPalindrome = Integer.toString(number);
        String reverse = new StringBuffer(testPalindrome).reverse().toString();

        if (number >= 10000 && number <= 99999){
            if (testPalindrome.equals(reverse)){
                // Number is a palindrome
                System.out.println(number + " is a palindrome");

            }else {
                //Not
                System.out.println(number + " is NOT a palindrome");
            }
        }else {
            // Int too small
            System.out.println("The inputted number is too small.");
        }

    }
}
