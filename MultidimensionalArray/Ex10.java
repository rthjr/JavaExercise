import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        String[][] capitals = {
            {"Cambodia", "Phnom Penh"},
            {"Thailand", "Bangkok"},
            {"China", "Beijing"},
            {"Japan", "Tokyo"},
            {"India", "Delhi"},
            {"Malaysia", "Kuala Lumpur"}
        };

        // Shuffle the array to randomize the order of questions
        Random rnd = new Random();
        for (int i = capitals.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String[] temp = capitals[index];
            capitals[index] = capitals[i];
            capitals[i] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        // Ask the user for each country's capital
        for (String[] country : capitals) {
            System.out.print("What is the capital of " + country[0] + "? ");
            String userAnswer = scanner.nextLine().trim().toLowerCase(); // Convert user input to lowercase

            if (userAnswer.equalsIgnoreCase(country[1].toLowerCase())) { // Compare ignoring case
                System.out.println("Your answer is correct.");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + country[1]);
            }
        }

        System.out.println("\nThe correct count is " + correctCount);
        scanner.close();
    }
}
