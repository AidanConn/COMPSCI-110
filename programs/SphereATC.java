//**************************
//SphereATC.java
//
//Author: Aidan Connaughton
//Date: 9/13/2022
//Class: COMSC110.02 Lab 2
//Instructor: Dr. Omar
//
//Purpose: To calculate the volume and surface area of a sphere from an inputted radius.
// **************************
import java.util.Scanner;

public class SphereATC {
    public static void main(String[] args) {
        // Ask for radius of sphere.
        System.out.println("Please enter the radius of the sphere.");
        Scanner scan = new Scanner(System.in);

        // Declare the radius
        double radius = scan.nextDouble();

        // Calculate the volume
        double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is: " + volume);

        // Calculate the surface area
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }
}

