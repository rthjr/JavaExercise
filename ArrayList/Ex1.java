import java.util.ArrayList;
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {

        // create object arraylist
        ArrayList<Integer> list = new ArrayList<>();

        int amount;

        // obj input scanner
        Scanner input = new Scanner(System.in);

        System.out.println("How many time you want to input: ");
        amount = input.nextInt();

        for (int i = 0; i < amount; i++) {

            list.add(input.nextInt());
        }

        input.close();

        // print the result
        System.out.println("Before: " + list);

        // modify order
        for (int i = list.size() - 1; i >= list.size() - 2; i--) {
            if (i == list.size() - 1) {
                int tempData = list.get(i);
                list.remove(i);
                list.add(0, tempData);
            }
            else{
                int tempData = list.get(i + 1);
                list.remove(i + 1);
                list.add(0, tempData);
            }
        }
        System.out.println("After: " + list);
    }

}