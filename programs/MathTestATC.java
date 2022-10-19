//**************************
//MathTestATC.java
//
//Author: Aidan Connaughton
//Date: 9/30/2022
//Class: COMSC110.02
//Instructor: Dr. Bai
//
//Purpose: Demo Math class methods
//**************************
public class MathTestATC {
    public static void main(String[] args) {
        // Trigonometric methods
        // sin(), tan(), toRadians(), etc. - Table 4.1
        System.out.println(Math.toDegrees(Math.PI / 2)); // 90.0
        System.out.println(Math.toRadians(30)); // PI/6 = 0.5235987755982988
        System.out.println(Math.sin(Math.PI / 6)); // 0.49999999999999994

        System.out.println(" "); // Blank line

        // Exponential methods
        // exp(x): returns e^x
        // log(x): returns ln(x) = log_e(x)
        // log10(x): returns log_10^x
        // pow(x, y): returns x^y
        // sqrt(x): returns the square root of x

        //1. e^3.5
        System.out.println(Math.exp(3.5)); // 33.11545195869231
        //2. ln(3.5)
        System.out.println(Math.log(3.5)); // 1.252762968495368
        //3. log_10(3.5)
        System.out.println(Math.log10(3.5)); // 0.5440680443502757
        //4. 3^2
        System.out.println(Math.pow(3, 2)); // 9.0
        //5. pow(4.5, 2.5)
        System.out.println(Math.pow(4.5, 2.5)); // 42.95673695708276
        //6. sqrt(4)
        System.out.println(Math.sqrt(4)); // 2.0
        //7. sqrt(10.5)
        System.out.println(Math.sqrt(10.5)); // 3.242640687119285

        // Blank line
        System.out.println(" "); // Blank line

        //ceil(x): returns a value which x is rounded UP to the nearest integer
        //floor(x): returns a value which x is rounded DOWN to the nearest integer

        //Math.ceil(2.1)
        System.out.println(Math.ceil(2.1)); // 3.0
        //Math.ceil(2.0)
        System.out.println(Math.ceil(2.0)); // 2.0
        //Math.ceil(-2.0)
        System.out.println(Math.ceil(-2.0)); // -2.0
        //Math.ceil(-2.1)
        System.out.println(Math.ceil(-2.1)); // -2.0

        //Math.floor(2.1)
        System.out.println(Math.floor(2.1)); // 2.0
        //Math.floor(2.0)
        System.out.println(Math.floor(2.0)); // 2.0
        //Math.floor(-2.0)
        System.out.println(Math.floor(-2.0)); // -2.0
        //Math.floor(-2.1)
        System.out.println(Math.floor(-2.1)); // -3.0

        // Blank line
        System.out.println(" "); // Blank line

        // min, max, and abs
        //Math.abs(-2);
        System.out.println(Math.abs(-2)); // 2.0
        //Math.abs(2)
        System.out.println(Math.abs(2)); // 2.0

        //Math.min(2.5, 4.6);
        System.out.println(Math.min(2.5, 4.6)); // 2.5
        //Math.max(2,8);
        System.out.println(Math.max(2, 8)); // 8.0

        // Math.max(Math.min(2.4, 5.6), Math.max(9.7, 5.8));
        System.out.println(Math.max(Math.min(2.4, 5.6), Math.max(9.7, 5.8))); // 9.7

        // Blank line
        System.out.println(" "); // Blank line

        // Random numbers
        // Math.random() returns a random number between 0.0 and 1.0 [0.0, 1.0). | 0.0 <= x < 1.0
        //Math.random();
        System.out.println(Math.random()); // 0.0 <= x < 1.0
        System.out.println(Math.random()); // 0.0 <= x < 1.0
        System.out.println(Math.random()); // 0.0 <= x < 1.0

        //Math.random() * 10;
        System.out.println(Math.random() * 10); // 0.0 <= x < 10.0 | [0.0, 10.0)

        //Math.random() * 10 + 5;
        System.out.println(Math.random() * 10 + 5); // 5.0 <= x < 15.0 | [5.0, 15.0)

        // int randomInt = (int)(Math.random() * 10 + 5);
        int randomInt = (int)(Math.random() * 10 + 5);

        System.out.println((int) (Math.random()* 8 +6)); // 6.0 <= x < 14.0 | [6.0, 14.0)





    }
}
