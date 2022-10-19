//**************************
//CircleATC.java
//
//Author: Aidan Connaughton
//Date: 10/19/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: Demo how to write our own class
//**************************

public class CircleATC {
    //no main method here
    //1- data fields: defines the properties of an object
    private double radius; // private means only the class can access it

    //2- methods: defines the behaviors of an object
    //add the special method called constructors: are methods - same name as the class + no return type
    public CircleATC() {
        radius = 10.0;
    }

    //overload constructor
    public CircleATC(double r) {
        radius = r;
    }

    // add a getter method to get the value of radius
    public double getRadius() {
        return radius;
    }

    // add a setter method to set the value of radius
    public void setRadius(double r) {
        radius = r;
    }

    //define a method to calculate the area of a circle
    public double getArea() {
        double result;
        result = Math.PI * radius * radius;
        return result;
    }
}
