import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Ex3 {

    // remove any dubplicate number
    static void removeDuplicate(ArrayList<Integer> al) {

        // sort the data in ascending order
        al.sort(Comparator.naturalOrder());

        for(int i = 0; i < al.size(); i++){
            if(al.get(i) == al.get(i + 1)){
                al.remove(i + 1);
            }
        }
    }

    // user input value 
    static void userIn(ArrayList<Integer> al) {
        Scanner input = new Scanner(System.in);
        int temp = 1;

        System.out.println("Enter a list of numbers (enter 0 to end): ");
        while (temp != 0) {
            temp = input.nextInt();
            if (temp != 0) {
                al.add(temp);
            }
        }
        input.close();
    }


    // print the result
    static void print(ArrayList<Integer> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        // create obj arraylist with type parameter
        ArrayList<Integer> al = new ArrayList<>();

        userIn(al);

        System.out.println("Original list:");
        print(al);

        removeDuplicate(al);

        System.out.println("List after removing duplicates:");
        print(al);
    }
}
