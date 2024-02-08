import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // variable
        int[] numbers = new int[10];
        int[] occur = new int[101];
        String string;

        // input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers between 1 and 100 separated by a space:");
        string = input.nextLine();
        input.close();

        // convert string to int
        String[] inputArray = string.split(" ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.valueOf(inputArray[i]);
        }

        // count
        for (int number : numbers) {
            if (number >= 1 && number <= 100) {
                
                occur[number]++;
                System.out.print(occur[number] + " ");
            } else {
                System.out.println("Please enter integers between 1 and 100.");
                return;
            }
        }
        System.out.println("\n");

        // display
        for (int i = 1; i <= 100; i++) {

            if (occur[i] == 1) {

                System.out.println(i + " occurs " + occur[i] + " time");
            } else if (occur[i] != 0 && occur[i] != 1) {

                System.out.println(i + " occurs " + occur[i] + " times");
            }
        }
    }
}
