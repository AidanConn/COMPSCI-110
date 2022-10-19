//**************************
//VariablePracticeATC.java
//
//Author: Aidan Connaughton
//Date: 9/13/2022
//Class: COMSC110.02 Lab 2
//Instructor: Dr. Omar
//
//Purpose: To practice using variables and assignment statements.
// **************************
public class VariablePracticeATC {
    public static void main(String[] args)
    {
        // Do not edit the next three lines
        int x = 1;
        int y = 2;
        int z = 3;

        // Edit the following lines.
        // Remember you may not use numbers
        // You may reorder the assignments, change or remove variables from the expressions,
        // or change the arithmetic operators being used

        y = z + x;
        x = y + x;
        y = z;
        z = x-z;



        // Do not edit the next two lines
        System.out.println("Your answer: x = " + x + ", y = " + y + ", z = " + z );
        System.out.println("Goal: x = 5, y = 3, z = 2");

    }
}
