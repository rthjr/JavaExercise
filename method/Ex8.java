public class Ex8 {

    public static int secondLarge(int[][] array2D) {

        int largest = 0;
        int secondLarge = 0;

        // find the second largest number in array
        for (int[] row : array2D) {
            for (int num : row) {
                if (num > largest) {
                    // largest number
                    secondLarge = largest;
                    largest = num;
                } else if (num > secondLarge && num < largest) {
                    // second largest number
                    secondLarge = num;
                }
            }
        }

        // no second largest was found
        if (secondLarge == 0) {
            return 0;
        }

        return secondLarge;
    }

    public static void main(String[] args) {

        // create 2d array
        int[][] array = {
            {11, 2, 3},
            {4, 13, 6},
            {7, 34, 9}
        };

        // pass the value and print
        int secondLargest = secondLarge(array);
        if (secondLargest == 0) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number: " + secondLargest);
        }
    }
}
