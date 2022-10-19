//**************************
//RockPaperScissorsATC.java
//
//Author: Aidan Connaughton
//Date: 9/27/22
//Class: COMSC110 LAB 4
//Instructor: Dr. Omar
//
//Purpose: Rock Paper Scissors against the computer
//**************************

import java.util.Scanner;

public class RockPaperScissorsATC {
    public static void main(String args[]) {
        // Declare variables
        int userChoice = 0, computerChoice = 0; // 0 = scissors, 1 = rock, 2 = paper

        // Step 1: Prompt the user to enter a number (0, 1, or 2)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (0 [Scissors], 1 [Rock], or 2 [Paper]): ");
        userChoice = input.nextInt();

        // Step 2: Generate a random number for the computer
        computerChoice = (int) (Math.random() * 3);

        // Step 3: Display the result | 0 = scissors, 1 = rock, 2 = paper | 0 beats 2, 1 beats 0, 2 beats 1
        if (userChoice == computerChoice) {
            System.out.println("Draw");
        } else if (userChoice == 0 && computerChoice == 1) {
            System.out.println("You lost!");
        } else if (userChoice == 0 && computerChoice == 2) {
            System.out.println("You win!");
        } else if (userChoice == 1 && computerChoice == 0) {
            System.out.println("You win!");
        } else if (userChoice == 1 && computerChoice == 2) {
            System.out.println("You lost!");
        } else if (userChoice == 2 && computerChoice == 0) {
            System.out.println("You lost!");
        } else if (userChoice == 2 && computerChoice == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("Invalid input!");
        }

        // Extra credit: Repeat the game until the user wants to quit
        String playAgain = "";

        System.out.println("Do you want to play again? (y/n)");
        playAgain = input.next();

        if (playAgain.equals("y")) {
            // Go back to step 1
            main(args);
        } else {
            // Exit
        }


    }
}
