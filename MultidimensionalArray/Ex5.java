import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[][] points = {
            {4, 2},
            {1, 7},
            {4, 5},
            {1, 2},
            {3, 1},
            {4, 1},
            {4, 9},
            {4, 3}
        };
        int length = points.length;
        int col = 1;

        // todo use insertion sort
        for (int row = 1; row < length; row++) {

            int[] key = points[row];
            System.out.println("store:"+Arrays.toString(key));
            int j = row - 1;

            // Shift elements of points[0..row-1] that are greater than key[col] to right
            while (j >= 0 && (points[j][col] > key[col] || (points[j][col] == key[col] && points[j][0] > key[0]))) {
                points[j + 1] = points[j];
                j--;
            }
            points[j + 1] = key;
        }

        // todo print sorted points
        for (int[] point : points) {
            System.out.println(Arrays.toString(point));
        }
    }
}
