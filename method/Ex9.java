import java.util.Arrays;
import java.util.Random;

public class Ex9 {

    public static void displayLeaders(int[] randomArray) {
        int n = randomArray.length;
        int toRight = randomArray[n - 1];
        StringBuilder leaders = new StringBuilder();

        // rightmost element is always a leader
        leaders.append(toRight).append(" ");

        // the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (randomArray[i] > toRight) {
                toRight = randomArray[i];
                leaders.insert(0, toRight + " ");
            }
        }

        System.out.println("Leaders:");
        System.out.println(leaders);
    }

    public static void main(String[] args) {
        // Generate a random array of 20 integers
        Random random = new Random();
        int[] randomArray = new int[20];

        // store the random value
        for (int i = 0; i < 20; i++) {
            // random integers from 1 to 100
            randomArray[i] = random.nextInt(100) + 1; 
        }

        System.out.println("Generated Array:");
        System.out.println(Arrays.toString(randomArray));

        // display leaders
        displayLeaders(randomArray);
    }
}
