

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {

        // todo create multi array variable 
        int[][] arrayMain = {
            {1, 3},
            {5, 7},
            {9, 11},
            {13, 15, 17},
        };

        int[][] searchKey = {
            {1, 3},
            {13, 15, 17},
        };

        // todo display arrayMain 
        System.out.println("Main Key:");
        for (int i = 0; i < arrayMain.length; i++) {

            System.out.println(Arrays.toString(arrayMain[i]));
        }

        // todo display searchKey
        System.out.println("Search Key:");
        for (int i = 0; i < searchKey.length; i++) {

            System.out.println(Arrays.toString(searchKey[i]));
        }

        // todo check if searchKey is a subset of arrayMain
        System.out.println("Result the subset are: ");
        for (int i = 0; i < searchKey.length; i++) {
            
            for (int j = 0; j < arrayMain.length; j++) {

                if (Arrays.equals(searchKey[i], arrayMain[j])) {

                    System.out.println(Arrays.toString(searchKey[i]));
                }
            }
        }

    }
}
