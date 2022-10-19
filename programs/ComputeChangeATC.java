//**************************
//ComputeChangeATC.java
//
//Author: Aidan Connaughton
//Date: 9/20/22
//Class: COMSC110 LAB 2
//Instructor: Dr. Omar
//
//Purpose: This program will ask the user to enter a double amount and then display the number of quarters, dimes, nickels, and pennies that are in the amount.
//**************************

import java.util.Scanner;

public class ComputeChangeATC {
    public static void main(String[] args) {
        // Step 1 get user input
        System.out.println("Enter an amount in double, for example 11.56: ");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();

        // Step 2 Get remainder of amount
        int remainingAmount = (int) (amount * 100);

        // Number of dollars, quarters, dimes, nickels, and pennies
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;


        // Step 3 : Display results if the amount in over 0 and use proper grammar for singular and plural

        System.out.println("Your amount " + amount + " consists of");
        if (numberOfOneDollars > 0) {
            if (numberOfOneDollars == 1) {
                System.out.println("    " + numberOfOneDollars + " dollar");
            } else {
                System.out.println("    " + numberOfOneDollars + " dollars");
            }
        }
        if (numberOfQuarters > 0) {
            if (numberOfQuarters == 1) {
                System.out.println("    " + numberOfQuarters + " quarter");
            } else {
                System.out.println("    " + numberOfQuarters + " quarters");
            }
        }
        if (numberOfDimes > 0) {
            if (numberOfDimes == 1) {
                System.out.println("    " + numberOfDimes + " dime");
            } else {
                System.out.println("    " + numberOfDimes + " dimes");
            }
        }
        if (numberOfNickels > 0) {
            if (numberOfNickels == 1) {
                System.out.println("    " + numberOfNickels + " nickel");
            } else {
                System.out.println("    " + numberOfNickels + " nickels");
            }
        }
        if (numberOfPennies > 0) {
            if (numberOfPennies == 1) {
                System.out.println("    " + numberOfPennies + " penny");
            } else {
                System.out.println("    " + numberOfPennies + " pennies");
            }
        }


    }
}
