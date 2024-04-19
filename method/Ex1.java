import java.util.Arrays;

public class Ex1 {
    // todo define the fix value
    static final int range = 1200;
    static final int pairs = 2;
    static int[][] primeNum = new int[range / 2][pairs];

    // todo create method to store and display value
    static void displayTwinPrime() {

        // todo 3 because num less than 3 minus the val not equal to 2
        int previousPrime = 3;
        int index = 0;

        for (int i = 5; i < range; i++) {

            // todo create both previos prime and next prime
            if (calculate(i) && calculate(i - 2)) {
                primeNum[index][0] = previousPrime;
                primeNum[index][1] = i;
                index++;
            }
            // todo we have found enough twin prime pairs
            if (index >= range / 2) {
                break; 
            }
            if (calculate(i)) {
                previousPrime = i;
            }
        }

        // todo print the twin prime pairs
        for (int i = 0; i < primeNum.length && primeNum[i][0] != 0; i++) {
            System.out.println(Arrays.toString(primeNum[i]));
        }
    }

    // todo creat method to calculate the prime num
    static boolean calculate(int i) {

        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {
        displayTwinPrime();
    }
}
