
//************************************************
//
//Name: MethodTestRVK
//
//Author: Aidan Connaughton
//Date: 10/14/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: To experiment with methods
//************************************************

public class MethodTestRVK {

    public static void main(String[] args){

        //v1 - Sum(double, int)
        System.out.println("Printing the result of the first overloading method v1: " + Sum(50.8, 10));

        //v2 - Sum(int, int ,int)
        System.out.println("Printing the result of the second overloading method v2: " + Sum(10, 20, 5));

        PrintGrade(38);

    }

    // Add our own methods
    // method 1: sum() which will take 2 integers and adds their values
    public static int Sum(int n1, int n2){
        return (n1+n2);
    }

    // add overloaded method Sum() | Change the data type of the parameters
    public static double Sum(double n1, int n2){
        return (n1+n2);
    }

    //v2 - overloaded method Sum() | Change the number of parameters
    public static int Sum(int n1, int n2, int n3){
        return (n1+n2+n3);
    }

    public static void PrintGrade(int grade){
        switch (grade / 10){
            case 9 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            default -> System.out.println("F");

        }
    }
    public static boolean IsPrime(int number){
        for (int divisor = 2; divisor <= number; divisor++){
            if (number % divisor == 0)
                return false;
        }
        return true;
    }

}