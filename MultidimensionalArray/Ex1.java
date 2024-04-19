

public class Ex1 {
    public static void main(String[] args) {

        // todo create multi array
        int[][] num1 = { 

            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };
        int[][] num2 = {
            
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };
        int length = num1.length;

        //* calculate the sum between num1 and num2
        int[][] sum = new int[length][length];

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

                sum[i][j] = num1[i][j] + num2[i][j];
            }
        }
        
        // todo print the sum matrix
        System.out.println("Result: ");
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
               
                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }
    }
}
