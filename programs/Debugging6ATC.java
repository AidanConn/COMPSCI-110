//**************************
//Debugging6ATC.java
//
//Author: Aidan Connaughton
//Date: 10/18/2022
//Class: COMSC110 LAB
//Instructor: Dr. Omar
//
//Purpose: Debug the code of the program
//**************************

import java.util.Scanner;

/**
 * This class prompts the user for string and determines
 * whether or not it is a palindrome.
 */

public class Debugging6ATC {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        if (isPalindrome(s))
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " is not palindrome");
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }


    public static String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }

}

