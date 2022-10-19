//**************************
//GeometryATC.java
//
//Author: Aidan Connaughton
//Date: 10/18/2022
//Class: COMSC110 LAB
//Instructor: Dr. Omar
//
//Purpose: To have a menu and have the user choose what they want to calculate
//**************************

import java.util.Scanner;

public class GeometryATC {
    public static void main(String[] args) {
        // While loop to keep the menu going
        while (true) {
            // Step 1: Create a menu
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            System.out.println("Enter your choice (1-4): ");

            // Step 2: Get the user's selection
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();

            // Step 3: Use a switch statement to determine which calculation to perform
            switch (selection) {
                case 1 -> {
                    // Step 4 (a): Calculate the area of a circle
                    AreaOfCircle();
                }
                case 2 -> {
                    // Step 4 (b): Calculate the area of a rectangle
                    AreaOfRectangle();
                }
                case 3 -> {
                    // Step 4 (c): Calculate the area of a triangle
                    AreaOfTriangle();
                }
                case 4 -> {
                    // Step 4 (d): Quit the program
                    System.out.println("Goodbye!");
                    System.exit(0); // Exit the program
                }

                default -> System.out.println("Invalid selection");
            }
        }
    }

    public static void AreaOfCircle(){
        // Step 5: Get the radius from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Step 6: Check for in valid input (negative radius, or 0)
        if (radius <= 0){
            System.out.println("Invalid input");
            return; // returns to the main method
        }

        // Step 7: Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Step 8: Display the result
        System.out.println("The area of the circle is " + area);

    }

    public static void AreaOfRectangle(){
        // Step 5: Get the radius from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Step 6: Check for in valid inputs (negative radius, or 0)
        if (length <= 0 || width <= 0){
            System.out.println("Invalid input");
            return; // returns to the main method
        }

        // Step 7: Calculate the area of the circle
        double area = length * width;

        // Step 8: Display the result
        System.out.println("The area of the rectangle is " + area);

    }

    public static void AreaOfTriangle(){
        // Step 5: Get the radius from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Step 6: Check for in valid inputs (negative radius, or 0)
        if (base <= 0 || height <= 0){
            System.out.println("Invalid input");
            return; // returns to the main method
        }

        // Step 7: Calculate the area of the circle
        double area = base * height * 0.5;

        // Step 8: Display the result
        System.out.println("The area of the triangle is " + area);

    }


}
