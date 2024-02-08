package BasicToJava;

import java.util.*;

public class Exercise2 {

    public static void main(String[] args)
    {
        //  create an object of scanner
        Scanner input = new Scanner(System.in);
        int number = 0, count = 0;



        while(true)
        {
            count++;
            number = input.nextInt();
            number += number;
            
            if(count > 5)
            {
                break;
            }
        }
       
        //  print
        System.out.println("The last number you entered was a " + number);
        input.close();
    }
}


