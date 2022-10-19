//**************************
//WindChillTableATC.java
//
//Author: Aidan Connaughton
//Date: 10/11/2022
//Class: COMSC110.02
//Instructor: Dr. Omar
//
//Purpose: This program will display a table of wind chill values
//**************************

public class WindChillTableATC {
    public static void main(String[] args) {
        // For loop to print the table of wind chill values
        System.out.println("Wind Chill Table");

        System.out.print("\t\t");
       for (int j = 40; j >= -45; j-=5) {
              System.out.print(j + "\t");


       }
         System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");


        for (int i = 5; i <= 60; i+=5){
            // Wind speed (i) = 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60

            System.out.print(i +  " | \t"); // Prints the wind speed



            for (int j = 40; j >= -45; j-=5){
                // Wind speed (j) = 40, 35, 30, 25, 20, 15, 10, 5, 0, -5, -10, -15, -20, -25, -30, -35, -40, -45

                // Calculate wind chill
                double windChill = 35.74 + 0.6215 * j - 35.75 * Math.pow(i, 0.16) + 0.4275 * j * Math.pow(i, 0.16);

                // Print wind chill
                System.out.print( Math.round(windChill)+"  ") ;
            }
               System.out.println();
        }









    }
}
