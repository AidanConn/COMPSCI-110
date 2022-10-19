import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class randomPrj {
    // This is a random project to take a input from the user and store it in a file
    public static void main(String args[]){
        // Take input from the user
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String wordy = input.next();
        // Write the input to a file
        try {
            FileWriter myWriter = new FileWriter("randomPrj.txt");
            myWriter.write(wordy);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
