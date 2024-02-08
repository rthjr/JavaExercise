package BasicToJava;

import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args)
{
    int total = 0;
    //  create an object of scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Input the value: ");
    
    //  calculate
    while (total <= 50) 
    {

        int sum = input.nextInt();
        total += sum;
    }
   
    //  print
    System.out.print("The total is [total] : " + total);

    //  close the scanner object;
    input.close();
}
}
