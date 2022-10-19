//**************************
//Debugging4ATC.java
//
//Author: Aidan Connaughton
//Date: 9/27/22
//Class: COMSC110 Lab 4
//Instructor: Dr. Omar
//
//Purpose: Debugging #4
//**************************


import java.util.Scanner;

public class Debugging4ATC {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int i = 0;
        System.out.println("Number " + ++i + " is: " + number1);
        System.out.println("Number " + ++i + " is: " + number2);
        System.out.println("Number " + ++i + " is: " + number3);

        int total = 0;
        total = total + number1;
        total += number2;
        total += number3;

        int denominator = 3;
        System.out.println("The average is: " + total / denominator);


    }

}
