package BasicToJava;
//  Group 12

import java.util.Scanner;

public class Exercise6 
{
    public static void main(String[] args)
    {
        //  create an object of scanner
        Scanner input = new Scanner(System.in); 
        int Number, NegativeC = 0, PositiveC = 0, total = 0, average;

        //  to find the negative and positive num
        System.out.println("Input the number: ");
        
        do
        {
            Number = input.nextInt();
            //  positive
            if(Number > 0)
            {
                PositiveC++;
            }

            //  negative
            else if(Number < 0)
            {
                NegativeC++;
            }

            //  sum all the numeber
            total += Number;

            //  find the average
            average = (total / (PositiveC + NegativeC));
        }
        while(Number != 0);

        //  print the result
        System.out.println("The positive number : " + PositiveC);
        System.out.println("The Negative number : " + NegativeC);
        System.out.println("The total number : " + total);
        System.out.println("The Average number : " + average);
        input.close();
    }
}
