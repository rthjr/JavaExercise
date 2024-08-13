
// (Count characters, words, and lines in a file) Write a program that will count the number of characters, words, and lines in a file.

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2 {
    public static void main(String[] args) {
        readerChar();
        readerLine();
        readerWord();
    }

    static void readerChar() {
        int i;
        int charCount = 0;

        try {
            FileReader reader = new FileReader("TxtFile/Countries.txt");
            while ((i = reader.read()) != -1) {
                if (((char) i != '\n') && ((char)i != ' ')) {
                    charCount += 1;
                }
            }
            System.out.println("There are " + charCount + " characters.");
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void readerLine() {
        String line;
        int lineCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("TxtFile/Countries.txt"));
            while ((line = reader.readLine()) != null) {
                lineCount += 1;
            }
            System.out.println("There are " + lineCount + " lines.");
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void readerWord() {
        String line, word;
        int wordCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("TxtFile/Countries.txt"));
            while ((line = reader.readLine())!= null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("There are " + wordCount + " words.");
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}