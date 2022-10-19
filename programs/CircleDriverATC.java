//**************************
//CircleDriverATC.java
//
//Author: Aidan Connaughton
//Date: 10/19/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: Demo how to call a defined class to create an object
//**************************

public class CircleDriverATC {
    public static void main(String[] args){
        //create an object of the class CircleATC
        CircleATC circle1 = new CircleATC(); // call the default constructor

        System.out.println("The radius of the circle1 is " + circle1.getRadius()); // 10.0

        //create the 2nd circle object by calling the overloaded constructor
        CircleATC circle2 = new CircleATC(20.9);
        System.out.println("The radius of the circle2 is " + circle2.getRadius()); // 20.9

        //change the radius of circle2
        circle2.setRadius(100.0); // call the setter method
        System.out.println("The radius of the circle2 is " + circle2.getRadius()); // 100.0



    }
}
