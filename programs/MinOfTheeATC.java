import java.util.Scanner;

//**************************
//MinOfTheeATC.java
//
//Author: Aidan Connaughton
//Date: 9/14/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: Demonstrate the use of if-else statement
//**************************
public class MinOfTheeATC {
    public static void main(String[] args) {
        // Step1: read in 3 integers from the keyboard
        System.out.println("Enter three integers: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // Step2: compare the 3 integers and figure out the minimum value
        if(num1 < num2){ // Check num1 is smaller than num2
            if(num1 < num3){ // num1 is smaller than num3
                System.out.println("The minimum value is: " + num1); // num1 is the smallest
            } else {
                System.out.println("The minimum value is: " + num3); // num3 is the smallest
            }
        } else {
            if(num2 < num3){ // Check num2 is smaller than num3
                System.out.println("The minimum value is: " + num2); // num2 is the smallest
            } else {
                System.out.println("The minimum value is: " + num3); // num3 is the smallest
            }

        }

        // Step3: print out the minimum value


    }
}
