import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 12: ");

        try {
            int monthIndex = scanner.nextInt() - 1;
            System.out.println(months[monthIndex] + " has " + days[monthIndex] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
