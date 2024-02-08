package BasicToJava;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args)
    {
        //   create an object of scanner
        Scanner input = new Scanner(System.in);
        char userChoice;
        int sum = 0;

        //  calculate the sum
        do {
            System.out.print("Enter number: ");
            int number1 = input.nextInt();

            System.out.print("Enter number: ");
            int number2 = input.nextInt();

            sum += number1 + number2;

            System.out.print("Do you want to add more num? (y/n): ");
            userChoice = input.next().charAt(0);

        } while (userChoice == 'y' || userChoice == 'Y');

        //  print the result
        System.out.println("The total is: " + sum);

        input.close();
    }
}
