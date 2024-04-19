import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String[] questions = new String[5];
        double[] answers = new double[5];
        double[] userResponses = new double[5];

        System.out.println("Math Quiz:");

        // Generate questions and collect user responses
        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(11) + 10; // Generates a random number between 10 and 20
            int num2 = random.nextInt(11) + 10; // Generates another random number between 10 and 20
            char operator = randomOperator(random);
            double result = evaluateExpression(num1, num2, operator);
            questions[i] = "Question " + (i + 1) + ": What is " + num1 + " " + operator + " " + num2 + "? ";
            answers[i] = result;

            System.out.print(questions[i]);
            userResponses[i] = scanner.nextDouble();
            if (Double.compare(answers[i], userResponses[i]) == 0) {
                score++;
            }
        }

        // Display results
        System.out.println("\nYou get " + score + " correct answers out of 5. The detail is below:");
        for (int i = 0; i < 5; i++) {
            System.out.print(questions[i]);
            if (Double.compare(answers[i], userResponses[i]) == 0) {
                System.out.println(" " + userResponses[i] + ". \tCorrect.");
            } else {
                System.out.println(" " + userResponses[i] + ". \tIncorrect. The correct answer is " + answers[i]);
            }
        }
        scanner.close();
    }

    public static char randomOperator(Random random) {
        char[] operators = {'+', '-', '*', '/'};
        return operators[random.nextInt(operators.length)];
    }

    public static double evaluateExpression(int num1, int num2, char operator) {
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (double) num1 / num2;
                result = Math.round(result * 100.0) / 100.0; // Round to two decimal places for division
                break;
        }
        return result;
    }
}
