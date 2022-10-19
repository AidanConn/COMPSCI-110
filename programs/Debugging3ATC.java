//**************************
//Debugging3ATC.java
//
//Author: Aidan Connaughton
//Date: 9/20/22
//Class: COMSC110.02
//Instructor: Dr. Omar
//
//Purpose: This class determines whether a number is divisible by 2 or 3.
//**************************

import java.util.Scanner;

public class Debugging3ATC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Input less than or equal to zero.");
        } else {

            System.out.println(number + " divisible by 2 and 3? " +
                    ((number % 2 == 0) && (number % 3 == 0)));
            System.out.println(number + " divisible by 2 or 3? " +
                    ((number % 2 == 0) || (number % 3 == 0)));
            System.out.println(number + " divisible by 2 or 3, but not both? " +
                    ((number % 2 == 0) ^ (number % 3 == 0)));
        }


    }
}
