import java.util.Scanner;

public class booleanMadness {
    // This is a random project to make a boolean chain. It take either a "y" or "n" from the user and then outputs a boolean value
    public static void main(String args[]){
        // User questioner and boolean chain (yes or no)
        System.out.println("Do you like to code? (y/n)");
        Scanner input = new Scanner(System.in);
        String number1 = input.next();

        // Next question
        System.out.println("Do you like to code in Java? (y/n)");
        String number2 = input.next();

        // Next question
        System.out.println("Do you like to code in Python? (y/n)");
        String number3 = input.next();

        // Next question
        System.out.println("Do you like to code in C++? (y/n)");
        String number4 = input.next();

        // Next question
        System.out.println("Do you like to code in C#? (y/n)");
        String number5 = input.next();

        // Next question
        System.out.println("Do you like to code in C? (y/n)");
        String number6 = input.next();

        // Next question
        System.out.println("Do you like to code in JavaScript? (y/n)");
        String number7 = input.next();

        // Next question
        System.out.println("Do you like to code in HTML? (y/n)");
        String number8 = input.next();

        // Print the results for each question
        System.out.println("You like to code: " + (number1));
        System.out.println("You like to code in Java: " + (number2));
        System.out.println("You like to code in Python: " + (number3));
        System.out.println("You like to code in C++: " + (number4));
        System.out.println("You like to code in C#: " + (number5));
        System.out.println("You like to code in C: " + (number6));
        System.out.println("You like to code in JavaScript: " + (number7));
        System.out.println("You like to code in HTML: " + (number8));




    }
}
