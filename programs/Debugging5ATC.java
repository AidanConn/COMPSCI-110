//**************************
//Debugging5ATC.java
//
//Author: Aidan Connaughton
//Date: 10/11/2022
//Class: COMSC110.02
//Instructor: Dr. Omar
//
//Purpose: Debugging 5 - Fix the errors in the following program
//**************************

import java.util.*;

/**
 * This class repeatedly prompts the user for an integer and a new base
 * and converts the decimal input into the new base.
 */

public class Debugging5ATC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char answer = 'y';
        do {
            System.out.print("Enter an integer: ");
            double n = input.nextDouble();

            System.out.print("Enter the new base: ");
            int base = input.nextInt();

            String outputString = "";
            int value = (int) n;


            while (value != 0) {
                outputString = value % base + outputString;

                value = value / base;
            }



            System.out.println(n + " in base " + base + " is " +
                    outputString);

            System.out.println("Would you like to convert another number?");
            answer = input.next().toUpperCase().charAt(0);

        } while (answer == 'Y');
    }
}

