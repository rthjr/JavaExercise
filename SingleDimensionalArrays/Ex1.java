import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read space-separated integers from the input line and parse them into an array
        String inputArray = input.nextLine();
        int[] array = new int[inputArray.length()];
        for (int i = 0; i < inputArray.length(); i++) {
            array[i] = inputArray.charAt(i);
        }
        input.close();

        int[] temp = Arrays.copyOf(array, array.length);
        // Sort the copy in parallel
        Arrays.parallelSort(array);

        // Check if the sorted array is equal to the original array
        if (Arrays.equals(temp, array)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("No");
        }
    }
}
