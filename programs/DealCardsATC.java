//**************************
//DearlCardsATC.java
//
//Author: Aidan Connaughton
//Date: 10/11/2022
//Class: COMSC110.02
//Instructor: Dr. Omar
//
//Purpose: This programs simulates dealing cards using loops
//**************************

import java.util.Scanner;

public class DealCardsATC {
    int dealtCards = 0;
    public static void main(String[] args) {
        // Declare dealCards variable
        int dealtCards = 0;

        // While statement to keep going until user enters n
        while (true){
            pickCard(); // Call pickCard method
            dealtCards++; // Increment dealtCards by 1

            // Print the number of cards dealt
            if(dealtCards >1){
                System.out.println("You have been dealt " + dealtCards + " cards");
            }
            else{
                System.out.println("You have been dealt " + dealtCards + " card");
            }

            // prompt user to continue
            System.out.println("Do you want to continue? (y/n)");
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            if (answer.equals("n")){
                break; // Break out of the loop
            }
        }




    }


    // Function to pick a random card
    public static int pickCard() {
        // Generate a random number between 1 and 13 for the card number
        int card = (int) (Math.random() * 13) + 1;

        // Generate a random number between 1 and 4 representing the suit
        int suit = (int) (Math.random() * 4) + 1;

        // Check the card
        String cardName = "";
        switch (card) {
            case 1 -> cardName = "Ace";
            case 2 -> cardName = "2";
            case 3 -> cardName = "3";
            case 4 -> cardName = "4";
            case 5 -> cardName = "5";
            case 6 -> cardName = "6";
            case 7 -> cardName = "7";
            case 8 -> cardName = "8";
            case 9 -> cardName = "9";
            case 10 -> cardName = "10";
            case 11 -> cardName = "Jack";
            case 12 -> cardName = "Queen";
            case 13 -> cardName = "King";

        }

        String suitName = "";
        // Check the suit
        switch (suit) {
            case 1 -> suitName = "Clubs";
            case 2 -> suitName = "Diamonds";
            case 3 -> suitName = "Hearts";
            case 4 -> suitName = "Spades";

        }

        // Print the card
        System.out.println("You next card is the " + cardName + " of " + suitName);

        return card;



    }


}
