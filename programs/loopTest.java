import java.util.Scanner;

public class loopTest {
    // Purpose: For the user to enter names until they enter "stop" then ask how many names will be randomly picked.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String[] names = new String[100];
        int i = 0;
        while (!name.equals("stop")) {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            names[i] = name;
            i++;
        }

        System.out.print("How many names will be randomly picked? ");
        int num = input.nextInt();
        System.out.println("The names are: ");
        for (int j = 0; j < num; j++) {
            // When a name is picked, it is replaced with "stop" so it won't be picked again. If the name is "stop", pick a new name.
            int rand = (int) (Math.random() * i);
            while (names[rand].equals("stop")) {
                rand = (int) (Math.random() * i);
            }
            System.out.println(names[rand]);
            names[rand] = "stop";







        }
    }


}
