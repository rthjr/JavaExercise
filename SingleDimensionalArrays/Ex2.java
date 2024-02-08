import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // create variabeles
        Scanner input = new Scanner(System.in);
        System.out.println("Input one number: ");
        int amount = input.nextInt();
        String[] array1 = new String[amount];
        String[] array2 = new String[amount];

        // clear buffer
        input.nextLine();
        // input the first array string
        System.out.println("Enter string1: ");
        for (int i = 0; i < amount; i++) {
            array1[i] = input.nextLine();
        }


        // input the second array string
        System.out.println("Enter string2: ");
        for (int i = 0; i < amount; i++) {
            array2[i] = input.nextLine();
        }
        input.close();

        // display the intersection
        System.out.println("The intersection:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
        
    }
}
