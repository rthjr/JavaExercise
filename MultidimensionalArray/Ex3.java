public class Ex3 {
    public static void main(String[] args) {
        // todo create a variable
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        int length = multiArray.length;
        
        // todo access the lower(2-0)
        for (int i = length - 1; i >= 0; i--) {
            int row = i;
            int col = 0;

            // todo access the array
            while (row < length && col < length) {
                System.out.print(multiArray[row][col] + " ");
                row++;
                col++;
            }
            System.out.println();
        }

        // todo access the upper(1-2)
        for (int j = 1; j < length; j++) {
            int row = 0;
            int col = j;

            // todo access the array
            while (row < length && col < length) {
                System.out.print(multiArray[row][col] + " ");
                row++;
                col++;
            }
            System.out.println();
        }
    }
}
