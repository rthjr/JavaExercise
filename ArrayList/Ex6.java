import java.util.ArrayList;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        // the random number generator and arraylist
        Random numberRandom = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        
        // the ArrayList with 10 random numbers in the range [1, 10]
        for (int i = 0; i < 10; i++) {
            list.add(numberRandom.nextInt(10) + 1); // Generates a number between 1 and 10
        }
        
        // the generated ArrayList
        System.out.print("Random ArrayList: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // an array to keep track of the presence of numbers 1 through 10
        boolean[] currenNum = new boolean[10];
        
        // Mark the numbers that are present in the ArrayList
        for (int num : list) {
            currenNum[num - 1] = true; 
        }
        
        // display the missing numbers
        System.out.print("The missing number(s) is/are: ");
        
        for (int i = 0; i < 10; i++) {
            if (!currenNum[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        
    }
}
