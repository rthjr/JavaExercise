package SingleDimensionalArrays;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // todo ask the user to enter the number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (0 - 999): ");
        int number = input.nextInt();
        input.close();

        // todo array 
        String[] num1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num2 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] num3 = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] num4 = {"", "hundred"};

        // todo convert the number to English 
        String result = "";

        // todo when the number is 0
        if(number == 0) {
            result = "ZERO";
        }

        // todo when the number is in the range 1 - 9
        else if(number >= 1 && number <= 9) {
            result = num1[number];
        }

        // todo when the number is in the range 11 - 19
        else if(number >= 11 && number <= 19) {
            result = num2[number - 10];
        }

        // todo when the number is in the range 20 - 99
        else if(number >= 20 && number <= 99) {
            result = num3[number / 10] + " " + num1[number % 10];
        }

        // todo when the number is in the range 100 - 999
        else if (number >= 100 && number <= 999) {
            int hundreds = number / 100;
            System.out.println("Hundred: " + hundreds); 

            int tens = (number / 10) % 10; 
            System.out.println("Ten: " + tens); 

            int ones = number % 10; 
            System.out.println("One: " + ones); 

            result = num1[hundreds] + " " + num4[1]; 

            if (tens != 0 || ones != 0) { 
                result += " and ";
            }

            if (tens == 1) { 
                result += num2[ones];
            }

            if(tens == 1 && ones == 0){
                result += num3[tens];
            }
            else { 
                result += num3[tens];
                if (ones != 0) {
                    result += " " + num1[ones];
                }
            }
        }

        // todo print the result
        System.out.println("Result: " + result);
    }
}
