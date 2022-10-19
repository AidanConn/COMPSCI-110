//**************************
//BestSellerATC.java
//
//Author: Aidan Connaughton
//Date: 9/27/22
//Class: COMSC110 LAB 4
//Instructor: Dr. Omar
//
//Purpose: Take in the price from 3 stores and the percent off from 3 stores and find the best deal
//**************************

import java.util.Scanner;

public class BestSellerATC {
    public static void main(String args[]) {
        // Declare variables
        double price1 = 0, price2 = 0, price3 = 0; // Price of item
        double percentOff1 = 0, percentOff2 = 0, percentOff3 = 0; //Ex: 20% off is 20

        // Step 1: Prompt the user input for the price of the item from 3 sellers

        Scanner input = new Scanner(System.in);

        // Price input
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the price of the item from seller " + i + " (ex: 10 for $10) : ");

            if (i == 1) {
                price1 = input.nextDouble();
            } else if (i == 2) {
                price2 = input.nextDouble();
            } else {
                price3 = input.nextDouble();
            }
        }

        // Step 2: Prompt the user input for the percent off from 3 sellers

        // Percent off input
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the percent off from seller " + i + " (ex: 10 for %10 : ");

            if (i == 1) {
                percentOff1 = input.nextDouble();
            } else if (i == 2) {
                percentOff2 = input.nextDouble();
            } else {
                percentOff3 = input.nextDouble();
            }
        }

        // Step 3: Calculate the price after discount for each seller
        // Variables for price after discount
        double priceAfterDiscount1, priceAfterDiscount2, priceAfterDiscount3;

        // Calculate

        // Discounted Price = Price – ((Discount / 100) * Price)

        priceAfterDiscount1 = price1 - ((percentOff1 / 100) * price1);
        priceAfterDiscount2 = price2 - ((percentOff2 / 100) * price2);
        priceAfterDiscount3 = price3 - ((percentOff3 / 100) * price3);

        // Step 4: Find the best deal
        if (priceAfterDiscount1 < priceAfterDiscount2 && priceAfterDiscount1 < priceAfterDiscount3) {

            // Seller 1 is the best deal
            System.out.println("Seller 1 has the best discounted price at $" + priceAfterDiscount1);

        } else if (priceAfterDiscount2 < priceAfterDiscount1 && priceAfterDiscount2 < priceAfterDiscount3) {
            // Seller 2 is the best deal
            System.out.println("Seller 2 has the best discounted price at $" + priceAfterDiscount2);

        } else if (priceAfterDiscount3 < priceAfterDiscount1 && priceAfterDiscount3 < priceAfterDiscount2) {
            // Seller 3 is the best deal
            System.out.println("Seller 3 has the best discounted price at $" + priceAfterDiscount3);

        } else {
            // All sellers have the same price
            System.out.println("All sellers have the same discounted price at $" + priceAfterDiscount1);
        }


    }

}
