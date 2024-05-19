import java.util.Scanner;
import java.util.ArrayList;


public class Ex9 {

    // use insertion sort algorithm
    static void sorted(ArrayList<Integer> list){
        
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;

            // move to big num to right and small to left
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }


    // for user to in put value
    static void userIn(ArrayList<Integer> list){
        Scanner input = new Scanner(System.in);
        int domain = 5;

        System.out.println("Enter the number: ");
        for(int i = 0; i < 5; i++){
            list.add(input.nextInt());
        }
        input.close();
    }


    static void print(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        userIn(list);

        System.out.println("Before: ");
        print(list);

        System.out.println();
        sorted(list);
        System.out.println("After: " );
        print(list);
    }
}
