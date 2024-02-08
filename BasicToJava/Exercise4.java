package BasicToJava;

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args)
    {
        int targetNum = 50, guess, count = 0;
        Scanner input = new Scanner(System.in);

        do {
            
            guess = input.nextInt();
            
            // to catch the attemps
            count += 1;

            //  to check if guess higher than targetNum
            if (guess > targetNum)
            {   
                System.out.println("Your number is highter than 50.");
            }

            //  check if guess less that targetNum
            if (guess < targetNum) 
            {
                System.out.println("Your number is less than 50.");
            }

            //  to check if guess equal to targetNum
            if(guess == targetNum)
            {
                System.out.println("Well done, you took "+ count +" attemps.");
                break; 
            }
            
        } while (guess != 50);
        input.close();
    }
}
