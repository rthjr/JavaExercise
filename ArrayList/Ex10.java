
import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // user input
        userIn(list);

        // find the hightest number
        System.out.println("The hightest Number is : " + max(list));
        
    }


    // user input
    public static void userIn(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (end with 0):");
        int num;
        do {
            num = input.nextInt();
            list.add(num);
        } while (num != 0);
        input.close();
    }

    // find the hightest number
    public static Integer max(ArrayList<Integer> list) {
        if(list.size() == 0){
            return null;
        }
        else
        {
            
            // insertion sorted list
            for (int i = 1; i < list.size(); i++) {
                int key = list.get(i);
                int j = i - 1;
                while (j >= 0 && list.get(j) > key) {
                    list.set(j + 1, list.get(j));
                    j--;
                }
                list.set(j + 1, key);
            }

            return list.get(list.size() - 1);
        }
        
    }
}
