//**************************
//NestedLoopTestATC.java
//
//Author: Aidan Connaughton
//Date: 10/10/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: demo the structure of for loop and nested for loop
//**************************

public class NestedLoopTestATC {
    public static void main(String[] args){
        // Set up a regular for loop
        for (int i = 0; i < 6; i++){
            System.out.println("Monday!!!"); // print out Monday 6 times
        }
        for (int i = 0; i < 6; i+=2){
            System.out.println("*** Monday!!! ***"); // print out Monday 3 times
        }
        for (int i = 0; i < 6; i+=3){
            System.out.println("--- Monday!!! ---"); // print out Monday 2 times
        }

        // Line break
        System.out.println();

        // Set up a nested for loop
        int count = 0;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 8; j++){
                System.out.println("Pear"); // print out Pear 48 times
                count++;
            }

        }
        System.out.println("count = " + count);


        // extra credits: create a multiplication table
        System.out.println("Multiplication Table");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 6; j++){
                System.out.print(i*j + " \t");
            }
            System.out.println();
        }
    }
}
