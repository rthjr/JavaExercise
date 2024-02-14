package SingleDimensionalArrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // todo input the variable
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers separated by space: ");
        String numbers = input.nextLine();
        input.close();

        // todo split the input string by space
        String[] arrayNum = numbers.split(" ");

        // todo remove duplicates
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = i + 1; j < arrayNum.length; j++) {
                if (arrayNum[i].equals(arrayNum[j])) {
                    arrayNum[j] = "";
                }
            }
        }

        // todo print non-empty elements
        for (String num : arrayNum) {
            if (!num.equals("")) {
                System.out.print(num + " ");
            }
        }
    }
}





