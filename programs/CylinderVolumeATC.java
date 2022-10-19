//**************************
//CylinderVolumeATC.java
//
//Author: Aidan Connaughton
//Date: 10/4/2022
//Class: COMSC110 LAB
//Instructor: Dr. Omar
//
//Purpose: Compare two different calendar volumes and display the largest one.
//**************************

import java.util.Scanner;

public class CylinderVolumeATC {
    public static void main(String args[]){
        // Step 1: Get input of the radius and height of each cylinder

        // Vars declared
        double r1,r2, h1, h2 = 0.0;


        // First Cylinder
        System.out.println("Please input the RADIUS of Cylinder #1: ");
        Scanner input = new Scanner(System.in);
        r1 = input.nextDouble();

        System.out.println("Please input the HEIGHT of Cylinder #1: ");
        h1 = input.nextDouble();

        // Second Cylinder
        System.out.println("Please input the RADIUS of Cylinder #2: ");
        r2 = input.nextDouble();

        System.out.println("Please input the HEIGHT of Cylinder #2: ");
        h2 = input.nextDouble();

        // Step 2: Calculate the volumes
       double v1 = Math.PI * Math.pow(r1, 2) * h1;
       double v2 = Math.PI * Math.pow(r2, 2) * h2;

       // Step 3: Compare and display the largest one.
        if (v1 > v2){
            // Cylinder 1 had the largest volume
            System.out.println("Cylinder #1 has the largest volume at: " + v1);

        } else if (v1 < v2) {
            // Cylinder 2 had the largest volume
            System.out.println("Cylinder #2 has the largest volume at: " + v2);

        }else if (v1 == v2){
            // The cylinders are equal
            System.out.println("Cylinder #1 and #2 has equal volumes at: " + v1);

        }else{
            // Something went wrong
            System.out.println("Something went wrong!");

        }


    }
}
