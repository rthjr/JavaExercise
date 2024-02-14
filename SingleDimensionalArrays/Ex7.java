package SingleDimensionalArrays;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // todo create a variable to store the sentence
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        input.close();

        // todo remove special characters but not alphabets and spaces
        sentence = sentence.replaceAll("[^a-zA-Z\\s]", "");

        // todo print the remove
        System.out.print(sentence + "\n");

        // todo split the sentence into words
        String[] array = sentence.split("\\s");

        // todo  the longest word
        int count = 0;
        String longestWord = "";

        // todo compare the word length
        for (String result : array) {
            if (result.length() > count) {
                count = result.length();
                longestWord = result;
            }
        }

        // todo print the longest word
        System.out.println("The longest word is: " + longestWord + " (" + count + " characters)");
    }
}
