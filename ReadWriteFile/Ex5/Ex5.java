import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array string to store alphabets
        String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String fileName = createFile(input);
        readFile(alphabets, fileName);

        // Close the Scanner object at the end of the program
        input.close();
    }

    static String createFile(Scanner input) {
        System.out.print("Enter file name: ");
        String name = input.nextLine();
        
        File fileName = new File(name);
        try {
            if (fileName.createNewFile()) {
                System.out.println("File created successfully");
                
                // Optionally write to the file
                FileWriter writer = new FileWriter(fileName);
                writer.write("This is a test content.");
                writer.close();
            } else {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        return name;
    }

    static void readFile(String[] alphabets, String name) {
        try {
            int[] countAlphabets = new int[alphabets.length];
            FileReader reader = new FileReader(name);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int c;
            while ((c = bufferedReader.read()) != -1) {
                char character = Character.toUpperCase((char) c);
                for (int i = 0; i < alphabets.length; i++) {
                    if (character == alphabets[i].charAt(0)) {
                        countAlphabets[i]++;
                        break;
                    }
                }
            }
            reader.close();

            for (int i = 0; i < alphabets.length; i++) {
                System.out.println(alphabets[i] + " : " + countAlphabets[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
