//**************************
//MonthATC.java
//
//Author: Aidan Connaughton
//Date: 9/20/22
//Class: COMSC110 LAB 2
//Instructor: Dr. Omar
//
//Purpose: This program will ask the user to enter a month number and year to determine the amount of days there are in the month.
//**************************

import java.util.Scanner;

public class MonthATC {
    public static void main(String[] args) {
        // Step 1 get user input
        System.out.println("Enter a month (1 for Jan., 2 for Feb., etc.): ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println("Enter a year: ");
        int year = input.nextInt();


        // Declare variables
        int days = 0;
        String monthName = "";

        // Step 2 determine the number of days in the month

        // Switch statement to determine days in month
        switch (month) {
            case 1 -> {
                monthName = "January";
                days = 31;
            }
            case 2 -> {
                monthName = "February";
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            case 3 -> {
                monthName = "March";
                days = 31;
            }
            case 4 -> {
                monthName = "April";
                days = 30;
            }
            case 5 -> {
                monthName = "May";
                days = 31;
            }
            case 6 -> {
                monthName = "June";
                days = 30;
            }
            case 7 -> {
                monthName = "July";
                days = 31;
            }
            case 8 -> {
                monthName = "August";
                days = 31;
            }
            case 9 -> {
                monthName = "September";
                days = 30;
            }
            case 10 -> {
                monthName = "October";
                days = 31;
            }
            case 11 -> {
                monthName = "November";
                days = 30;
            }
            case 12 -> {
                monthName = "December";
                days = 31;
            }
            default -> System.out.println("Invalid month");
        }
        // Step 3 output the month name and number of days in the month to user
        System.out.println(monthName + " " + year + " has " + days + " days");
    }

}
