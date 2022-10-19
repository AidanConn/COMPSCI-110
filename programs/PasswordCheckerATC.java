//**************************
//PasswordCheckerATC.java
//
//Author: Aidan Connaughton
//Date: 10/18/2022
//Class: COMSC110 LAB
//Instructor: Dr. Omar
//
//Purpose: Use methods to check if a password is valid from the user
//**************************

import java.util.Scanner;

public class PasswordCheckerATC {
    public static void main(String[] args){
        // Step 1: Get the password from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String passwordInput = input.nextLine();

        // Step 2: Check if the password is valid
        if (isValidPassword(passwordInput)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String passwordInput) {
        // Step 3: Check if the password is at least 8 characters long and can't be more than 13 characters
        if (passwordInput.length() < 8 || passwordInput.length() > 13){
            if (passwordInput.length() < 8){
                System.out.println("Your password is too short.");
            }
            else{
                System.out.println("Your password is too long.");
            }
            return false; // Returns false for valid password
        }

        // Step 4: Check if the password contains at least 2 digits
        int digitCount = 0;
        for (int i = 0; i < passwordInput.length(); i++) {
            if (Character.isDigit(passwordInput.charAt(i))) {
                digitCount++; // Digit count increases by 1
            }
        }
        if (digitCount < 2) {
            System.out.println("Your password does not contain enough digits.");
            return false; // Returns false for valid password
        }

        // Step 5: Check if the password contains at least 1 uppercase letter and 1 lowercase letter
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (int i = 0; i < passwordInput.length(); i++) {
            if (Character.isUpperCase(passwordInput.charAt(i))) {
                upperCaseCount++; // Upper case count increases by 1
            } else if (Character.isLowerCase(passwordInput.charAt(i))) {
                lowerCaseCount++; // Lower case count increases by 1
            }
        }
        if (upperCaseCount < 1 || lowerCaseCount < 1) {
            System.out.println("Your password does not contain enough uppercase or lowercase letters.");
            return false; // Returns false for valid password
        }

        // Step 6: All criteria are met, return true
        return true;

    }


}
