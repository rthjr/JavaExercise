import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        // todo 2D array to store student information: name, math score, physics score, chemistry score, total score
        int domain = 4; 
        String[][] students = new String[domain][5]; 
        int finalTotal = 0;
        Scanner input = new Scanner(System.in);

        // todo claculate the total and input the subjects scores
        for (int i = 0; i < domain; i++) {
            
            System.out.print("Enter Math score for Student " + (i + 1) + ": ");
            students[i][1] = input.nextLine();

            System.out.print("Enter Physics score for Student " + (i + 1) + ": ");
            students[i][2] = input.nextLine();

            System.out.print("Enter Chemistry score for Student " + (i + 1) + ": ");
            students[i][3] = input.nextLine();

            // todo calculate total score
            int total = Integer.parseInt(students[i][1]) + Integer.parseInt(students[i][2]) + Integer.parseInt(students[i][3]);
            students[i][4] = Integer.toString(total);

            finalTotal += total;
        }

        // todo print out the details of all students
        System.out.println("\nStudent Details:");
        System.out.println(String.format("%-20s%23s%23s%22s%16s", "Name", "Math", "Physics", "Chemistry", "Total"));
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < domain; i++) {
            System.out.println(String.format("%-20s%20s%20s%20s%20s", "student" + (i + 1), students[i][1], students[i][2], students[i][3], students[i][4]));
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%105s%1d", "Total:", finalTotal));
        input.close();
    }
}
