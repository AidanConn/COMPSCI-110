//**************************
//BudgetPlanningATC.java
//
//Author: Aidan Connaughton
//Date: 10/4/2022
//Class: COMSC110 LAB
//Instructor: Dr. Omar
//
//Purpose: This program takes in 3 product prices and # of units and compares the cost against the budget to determine if it is within it.
//**************************

import java.util.Scanner;

public class BudgetPlanningATC {
    public static void main(String args[]){
        // Step 1: Input the budget

        // Vars
        double budget = 0.0;
        double p1Cost, p2Cost, p3Cost = 0.0;
        int p1Units, p2Units, p3Units = 0;
        double expenditure = 0.0;

        System.out.println("Please enter your budget: ");
        Scanner input = new Scanner(System.in);

        budget = input.nextDouble();

        //Step 2: Get the units prices and amounts

        System.out.println("Please enter Product #1 Unit Cost: ");
        p1Cost = input.nextDouble();

        System.out.println("Please enter Product #1 Amount of Units: ");
        p1Units = input.nextInt();

        System.out.println("Please enter Product #2 Unit Cost: ");
        p2Cost = input.nextDouble();

        System.out.println("Please enter Product #2 Amount of Units: ");
        p2Units = input.nextInt();

        System.out.println("Please enter Product #3 Unit Cost: ");
        p3Cost = input.nextDouble();

        System.out.println("Please enter Product #3 Amount of Units: ");
        p3Units = input.nextInt();

        //Step 3: Calculate the expenditure

        expenditure = (p1Cost * p1Units) + (p2Cost * p2Units) + (p3Cost * p3Units);

        //Step 4: Compare the budget against the expenditure and print out the results

        if (expenditure > budget){
            // Over budget
            System.out.println("The planned expenditures totaling $"+ expenditure + " are out of the budget of $" + budget + ".");

        } else if(expenditure <= budget) {
            // Under budget or equal
            System.out.println("The planned expenditures totaling $"+ expenditure + " are within the budget of $" + budget + ".");

        }else{
            // Something went wrong
            System.out.println("Something went wrong!");

        }






    }
}
