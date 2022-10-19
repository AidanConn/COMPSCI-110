//**************************
//Debugging2ATC.java
//
//Author: Aidan Connaughton
//Date: 9/13/2022
//Class: COMSC110.02 Lab 2
//Instructor: Dr. Omar
//
//Purpose: Take a four-digit integer and add up the individual digits together.
//**************************
import java.util.Scanner;

public class Debugging2ATC {
    public static void main(String[] args){

            final double TAX = 0.06;

            System.out.println("Enter the price: ");
            Scanner scanner = new Scanner(System.in);
            double price = scanner.nextDouble();


            System.out.println("The total including tax is $" + (price + TAX * price));
        }
}
