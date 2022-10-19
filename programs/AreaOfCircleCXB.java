//**************************
//AreaOfCircleCXB.java
//
//Author: Aidan Connaughton
//Date: 9-7-22
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: Calculate the area of a circle from the radius
//**************************
import java.util.Scanner;

public class AreaOfCircleCXB {
    public static void main(String[] args) {
        //declare a constant
        final double valuePi = 3.1415926;


        //step1: read in a radius
        //declare a variable
        double radius;
        //initialize th variable
        radius = 10.0;
        radius = 100.0;
        // System.out.println(radius); //100.0

        //step2: calc the area
        double area = radius * radius * Math.PI;

        //step3: output the area
        System.out.println("The radius: " + radius);
        System.out.println("The area is: " + area);
        System.out.println("The circle with radius of " + radius + " has the area of " + area);

        //how to read in a value of radius from the keyboard
        System.out.println("Input a radius: ");
        Scanner scan = new Scanner(System.in);
        double radius1 = scan.nextDouble();

        double area1 =  Math.pow(radius1, 2) * valuePi; //radius1^2
        System.out.println(area1);


    }
}
