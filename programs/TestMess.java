import java.util.Scanner;

public class TestMess {
    public static void main(String[] args) {
        test();

        Scanner scan = new Scanner(System.in);

        String Test2 = scan.next();

        scan.close();

        if(Test2 == "y"){
            System.out.println("Continuing...");
        }else if(Test2 == "n"){
            System.out.println("Stopping...");
        }else{
            System.out.println("Please enter either 'y' or 'n'.");
        }


    }

    public static void test() {
        ;
        boolean test1 = false;
        if (test1 == false) {
            System.out.println("Would you like to continue? : (Y/n)");
        }
    }

}
