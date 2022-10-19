import java.util.Scanner;

public class calcTest {
    public static void main(String[] args){
        System.out.println("Welcome to the worst calculator in the world...");

        System.out.println("Please enter an operator");
        Scanner scan = new Scanner(System.in);

        // Gives the user the option to choose an operator
        // Pirnt out the options
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exponent");
        System.out.println("7. Square Root");
        System.out.println("8. Cube Root");

        String operator = scan.next();

        // Gives the user the option to choose a number
        System.out.println("Please enter a number");
        double num1 = scan.nextDouble();
        System.out.println("Please enter another number");
        double num2 = scan.nextDouble();

        // If the user chooses addition
        if(operator == "1"){
            System.out.println(num1 + num2);
        }
        // If the user chooses subtraction
        else if(operator == "2"){
            System.out.println(num1 - num2);
        }
        // If the user chooses multiplication
        else if(operator == "3"){
            System.out.println(num1 * num2);
        }
        // If the user chooses division
        else if(operator == "4"){
            System.out.println(num1 / num2);
        }
        // If the user chooses modulus
        else if(operator == "5"){
            System.out.println(num1 % num2);
        }
        // If the user chooses exponent
        else if(operator == "6"){
            System.out.println(Math.pow(num1, num2));
        }
        // If the user chooses square root
        else if(operator == "7"){
            System.out.println(Math.sqrt(num1));
        }




       /*
        Only addition
        System.out.println("Please enter a number:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Please enter a second number:");
        int num2 = scan.nextInt();

        System.out.print("Output number: ");
        System.out.print(num1 + num2); */

    }
}
