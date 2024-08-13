import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex4 {
    public static void main(String[] args) {
        writeData();
        readData();
    }

    // Method to write data to file
    static void writeData() {
        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter("File/Scores.txt");
            // Write data to the file
            writer.write("12 13 14 15 16");
            writer.close();
        } catch (Exception e) {
            // If there's an error, display the message
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read data from file
    static void readData() {
        // Variables to hold the total and count of scores
        int total = 0;
        int count = 0;

        try {
            // Create a FileReader and BufferedReader object
            BufferedReader bufferedReader = new BufferedReader(new FileReader("File/Scores.txt"));
            
            // Read the content of the file as a single line
            String line = bufferedReader.readLine();
            
            // Split the line into an array of scores (as strings)
            String[] scores = line.split(" ");
            
            // Loop through each score
            for (String score : scores) {
                // the score as an integer and update the total and count
                try {
                    int num = Integer.parseInt(score);
                    total += num;
                    count++;
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }

            // Close the BufferedReader
            bufferedReader.close();
            
            // Display the total and average
            System.out.println("Total: " + total);
            System.out.println("Average: " + total / count);

        } catch (Exception e) {
            // Handle any errors
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
