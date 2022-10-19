//**************************
//NestedForLoopTestATC.java
//
//Author: Aidan Connaughton
//Date: 10/12/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: print out different patterns using nested for loops
//**************************

public class NestedForLoopTestATC {
    public static void main(String[] args){
        //pattern 1:
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        System.out.println("Pattern 1:");
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= 5; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        //pattern 2:
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        System.out.println("Pattern 2:");
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        //pattern 3:
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

        System.out.println("Pattern 3:");
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= 6 - row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        //pattern 4:
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1

        System.out.println("Pattern 4:");
        for (int row = 1; row <= 9; row++){
            if (row <= 5){
                for (int col = 1; col <= row; col++){
                    System.out.print(col + " ");
                }
            }
            else{
               for (int col = 1; col <= 10 - row; col++){
                        System.out.print(col + " ");
                    }
            }
            System.out.println();
        }

        System.out.println();


    }
}
