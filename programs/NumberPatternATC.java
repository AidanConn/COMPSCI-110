//**************************
//NumberPatternATC.java
//
//Author: Aidan Connaughton
//Date: 10/11/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: This program will display a pattern of numbers using nested for loops
//**************************
public class NumberPatternATC {
    public static void main(String[] args){
        // First loop is to get 6 rows printed
        for (int i = 6; i>=1;i--){
            // Second loop is to get the numbers printed
            for (int j = 1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
