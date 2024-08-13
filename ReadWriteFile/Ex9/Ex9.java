import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

// Create class of employee
class Employee {

    // Create variables
    int id;
    String name;
    char gender;
    float salary;

    // Read data
    void readEmployee() {
        try {
            String line;

            // Create obj bufferedreader to read line by line
            BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"));

            // Access to each line of txt file
            while ((line = reader.readLine()) != null) {

                // select each word by split with space and store in array string
                String[] data = line.split(" ");

                // format to display the result
                System.out.format("%1s %15s %15s %15s", data[0], data[1], data[2], data[3]);
                System.out.println();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Write data
    void addEmployee() {
        try {
            // create obj filewriter to write data by append(add more data without rewrite the entire file)
            FileWriter writer = new FileWriter("Employee.txt", true);

            // input data separate by space
            writer.write(id + " " + name + " " + gender + " " + salary + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete data
    void deleteEmployee(int id) {
        try {
            // Read by line
            BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"));

            // Create obj of stringbuilder because,  we need to append data 
            StringBuilder restoreData = new StringBuilder();
            String line;

            // Read Line by Line again
            while ((line = reader.readLine()) != null) {
                // split it again and store in array string
                String[] data = line.split(" ");

                // Check if the fist index that equal to id 
                if (Integer.parseInt(data[0]) != id) {
                    
                    // that put it in restoreData
                    restoreData.append(line).append("\n");
                }
            }

            // write to file again
            FileWriter writer = new FileWriter("Employee.txt");
            
            //convert to string and store to file
            writer.write(restoreData.toString());
            writer.close();
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

public class Ex9 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        while (true) {
            System.out.println(
                    "a. Add a new employee\n" +
                            "b. Delete employee by id\n" +
                            "c. Search employee by id\n" +
                            "d. Display all employees\n" +
                            "e. Exit the program");

            // user input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the character to pick the option: ");
            char userInput = input.next().charAt(0);

            // find the condition
            switch (Character.toLowerCase(userInput)) {
                case 'a':
                    addNewEmployee(employee);
                    employee.addEmployee();
                    break;
                case 'b':
                    deleteEmployee();
                    break;
                case 'c':
                    searchEmployee();
                    break;
                case 'd':
                    displayEmployee(employee);
                    break;
                case 'e':
                    exitProgram();
                    break;
                default:
                    System.out.println("Input value is invalid");
            }
        }
    }

    // user add more data and pass it to class employee 
    static void addNewEmployee(Employee employee) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        System.out.print("Enter the Gender (M/F): ");
        char gender = input.next().charAt(0);
        System.out.print("Enter the Salary: ");
        float salary = input.nextFloat();

        employee.id = id;
        employee.name = name;
        employee.gender = gender;
        employee.salary = salary;
    }

    // delete the data by inputing the id

    static void deleteEmployee() {
        Employee deleteEmployee = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee ID to delete: ");
        int id = input.nextInt();

        // pass the id to the method deleteEmployee of class employee
        deleteEmployee.deleteEmployee(id);
    }

    static void searchEmployee() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee ID to search: ");
        int id = input.nextInt();
        Employee search = new Employee();
        try {
            // read line by line
            BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // split and store in array
                String[] data = line.split(" ");

                // check of the id equal to index 0
                if (Integer.parseInt(data[0]) == id) {

                    // than display the result
                    search.id = Integer.parseInt(data[0]);
                    search.name = data[1];
                    search.gender = data[2].charAt(0);
                    search.salary = Float.parseFloat(data[3]);
                    System.out.println("Employee Found: ID=" + search.id + ", Name=" + search.name + ", Gender=" + search.gender + ", Salary=" + search.salary);
                    break;
                }
                else{
                    System.out.println("ID is invalid");
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }


    // display all employee
    static void displayEmployee(Employee employee) {
        System.out.println("----------------------------------------------------");
        System.out.format("%1s %15s %15s %15s", "ID", "Name", "Gender", "Salary");
        System.out.println();
        System.out.println("----------------------------------------------------");
        employee.readEmployee();
    }

    // stop the program
    static void exitProgram() {
        System.exit(0);
    }
}
