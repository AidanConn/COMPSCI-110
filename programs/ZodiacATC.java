//**************************
//ZodiacATC.java
//
//Author: Aidan Connaughton
//Date:
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose:
//**************************

import java.util.Scanner;

public class ZodiacATC {
    public static void main(String[] args) {
        // Declare variables
        int birthYear = 2003;
        String zodiac;


        // Zodiac is calculated by year being remainder of 12
        switch (birthYear % 12) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
            default:
                zodiac = "Invalid year";
                break;
        }
        System.out.println("Your zodiac sign is " + zodiac);


    }
}
