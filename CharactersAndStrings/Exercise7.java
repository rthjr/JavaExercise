package CharactersAndStrings;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        // create scanner obj and input variable
        System.out.println("Enter the sentence:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        // create stringbuilder obj
        StringBuilder result = new StringBuilder();

        // Process the rest of the characters
        for (int i = 0; i < word.length(); i++) {

            // conver string to char
            char ch = word.charAt(i);
            char previousChar;

            // handle the first index and check the prevous index
            if(i == 0){

                previousChar = word.charAt(i);

            }else{

                previousChar = word.charAt(i - 1);

            }  

            // to check the letter and space, also the first index
            if ((Character.isLetter(ch) && previousChar == ' ') || i == 0) { 

                result.append(Character.toUpperCase(ch));

            } 
            // to check if the character is big than convert it to small char
            else if(Character.isLetter(ch) == Character.isUpperCase(ch)){

                result.append(Character.toLowerCase(ch));

            }else{

                result.append(ch);

            }
        }

        // print the result
        System.out.println(result.toString());
    }
}
