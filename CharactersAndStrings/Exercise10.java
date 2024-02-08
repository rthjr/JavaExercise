package CharactersAndStrings;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Calculate and display the results
        int wordCount = 0;
        int consonantCount = 0;
        int vowelCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        String vowel = "aeiouAEIOU";

        // define the domain form 0 to the end of value input
        for(int i = 0; i < sentence.length(); i++){

            // stirng to char_getPassword
            char chSentence = sentence.charAt(i);
            

            // check the word and condition of the first index
            if(i == 0 && Character.isLetter(chSentence)){
                wordCount++;
            }
            else if(Character.isWhitespace(chSentence) && Character.isLetter(sentence.charAt(i + 1))){
                wordCount++;
            }

            // check the vowel
            for(int j = 0; j < vowel.length(); j++){

                char chvowel = vowel.charAt(j);
                if(chSentence == chvowel){

                    vowelCount++;
                }
            }

            // check the consonant
            if(Character.isLetter(chSentence)){
                consonantCount++;
            }

            // check the digit
            if(Character.isDigit(chSentence)){
                digitCount++;
            }

            // check the special cha
            if(!Character.isLetterOrDigit(chSentence)){
                specialCharCount++;
            }
        }

        consonantCount = consonantCount - vowelCount;

        System.out.println("\nAnalysis of the entered sentence:");
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}