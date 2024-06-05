
import java.util.ArrayList;
import java.util.Scanner;

class Ex11{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        final int length = 10;

        // user input
        in(list, length);

        // remove duplicate
        removeDuplicate(list);

        // display
        display(list);
    }

    // user input
    public static void in(ArrayList<Integer> list, int length) {

        System.out.print("Enter the Number as horizontal: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < length; i++){
            list.add(input.nextInt());
        }
        input.close();
    }

    // remove duplicate
    public static void removeDuplicate(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int currentValue = list.get(i);
            for (int j = i + 1; j < size; j++) {
                if (currentValue == list.get(j)) {
                    list.remove(j);
                    size--; 
                    j--; 
                }
            }
        }
    }
    

    // display
    public static void display(ArrayList<Integer> list) {

        System.out.print("The distinct integers are ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}