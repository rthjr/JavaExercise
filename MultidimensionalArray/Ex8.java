import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        // todo create a multi-array to store days and employees
        int[][] totalHours = {
                { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 3, 4, 4, 6, 3, 4, 4 },
                { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 6, 2, 7, 9 },
        };

        int length = totalHours.length;
        int[] total = new int[length];
        int[] originalIndices = new int[length];
        int[] tempRow;

        // todo find the total hours of each row and store the original indices
        for (int i = 0; i < length; i++) {
            int temp = 0;
            for (int j = 0; j < totalHours[i].length; j++) {
                temp += totalHours[i][j];
            }
            total[i] = temp;
            originalIndices[i] = i; // Store the original index
        }

        // todo sort the total hours in descending order using insertion sort
        for (int i = 1; i < length; i++) {
            int keyTotal = total[i];
            int keyIndex = originalIndices[i];
            tempRow = totalHours[i];
            int j = i - 1;

            while (j >= 0 && total[j] < keyTotal) {

                originalIndices[j + 1] = originalIndices[j];
                totalHours[j + 1] = totalHours[j];
                j--;
            }
            
            originalIndices[j + 1] = keyIndex;
            totalHours[j + 1] = tempRow;
        }

        // todo print sorted results with original employee numbers
        System.out.println("Sorted in descending order based on total hours, switched according to original order:");
        for (int i = 0; i < length; i++) {
            System.out.print("Employee " + originalIndices[i] + ": ");
            System.out.println(Arrays.toString(totalHours[i]));
        }
    }
}
