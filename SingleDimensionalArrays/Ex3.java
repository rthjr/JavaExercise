import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int domain = 3;
        String[] names = new String[domain];
        int[] ages = new int[domain];

        for (int i = 0; i < domain; i++) {
            System.out.println("Enter name and age of person " + (i + 1) + ":");
            names[i] = input.nextLine();
            ages[i] = input.nextInt();
            // Consume the remaining newline character after nextInt()
            input.nextLine();
        }

        // Print the names and ages
        for (int i = 0; i < domain; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }

        // Find the index of the person with the highest age
        int indexOfYoungest = 0;
        int youngAge = ages[0];
        for (int i = 1; i < domain; i++) {
            if (ages[i] < youngAge) {
                youngAge = ages[i];
                indexOfYoungest = i;
            }
        }

        System.out.println("The name of the youngest person is: " + names[indexOfYoungest]);
        input.close();
    }
}




