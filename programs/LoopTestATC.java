//**************************
//LoopTestATC.java
//
//Author: Aidan Connaughton
//Date: 10/6/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: Demo how loops work
//**************************

import java.util.Scanner;

public class LoopTestATC {
    public static void main(String[] args) {
        // Read in 5 integers and calc the sum
        //Step1 : read in 5 integers
        //Step2 : calc the sum
        //Step3 : print the sum
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers: ");

        final int TOTAL = 5;
        int num1 = 0;
        int sum1 = 0;

        while (num1 < TOTAL) {
            //read in one integer
            int data = input.nextInt();
            //sum the new data read in
            sum1 += data; // Sum1 = sum1 + data
            num1++;
        }

        System.out.println("Version 1 sum1 is " + sum1);

        // Version 2: use sentinel value to terminate the loop
        System.out.println("Enter version 2 integers: 0 to stop");
        int data = input.nextInt();
        int sum2 = 0;
        while (data != 0) {
            sum2 += data;
            data = input.nextInt();
        }
        System.out.println("Version 2 sum2 is " + sum2);

        // Version 3: rewrite version 1 using do-while loop
        int num3 = 0;
        int sum3 = 0;
        System.out.println("Enter 5 integers for version 3: ");

        do {
            int data3 = input.nextInt();
            sum3 += data3;
            num3++;
        } while (num3 < TOTAL);
        System.out.println("Version 3 sum3 is " + sum3);

        // Extra credit: rewrite version 2 using do-while loop
        int sum4 = 0;
        System.out.println("Enter version 4 integers: 0 to stop");
        int data4 = input.nextInt();
        do {
            sum4 += data4;
            data4 = input.nextInt();
        } while (data4 != 0);
        System.out.println("Version 4 sum4 is " + sum4);

    }
}
