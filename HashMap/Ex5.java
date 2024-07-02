
import java.util.HashMap;
import java.util.Scanner;

class Ex5{
    public static void main(String[] args) {

        // create obj 3 dimension hashmap
        HashMap<Integer, HashMap<String, HashMap<Integer, String>>> employee = new HashMap<>();

        // user pick the number
        Scanner input = new Scanner(System.in);
        String picker;

        // feature
        do{
            System.out.println(
                    "select any of the following features:\n" +
                    "a. Display all employees\n" +
                    "b. Add a new employee\n" +
                    "c. Delete employee by id\n" +
                    "d. Update employee by id\n" +
                    "e. Search employee by id\n" +
                    "f. Exit the program ");

            System.out.print("choose: ");
            picker = input.nextLine();

            switch(picker){
                case "a":
                    display(employee);
                    break;
                case "b":
                    add(employee);
                    break;
                case "c":
                    delete(employee);
                    break;
                case "d":
                    update(employee);
                    break;
                case "e":
                    search(employee);
                    break;
                case "f":
                    exit();
                default: throw new RuntimeException("The input option does not exist");
            }
        }while(true);
    }

    // print the result
    public static void display(HashMap<Integer, HashMap<String, HashMap<Integer, String>>> employee) {
        System.out.println("RESULT");
        System.out.println("-------------------------------------------------------------");
        System.out.println("ID\t\t\tName\t\t\tSalary\t\t\tDepartment");
        System.out.println("-------------------------------------------------------------");

        // use all key of each object from 3 dimension to variable
        for (Integer id : employee.keySet()) {
            // pass each key of 3 dimension to 2 dimension
            HashMap<String, HashMap<Integer, String>> idNameHash = employee.get(id);

            // get each key of 2 dimension
            for (String name : idNameHash.keySet()) {
                // pass 2 dimension to 1 dimension
                HashMap<Integer, String> salaryDepartmentHash = idNameHash.get(name);

                // get each key of 1 dimension
                for (Integer salary : salaryDepartmentHash.keySet()) {
                    // get the value of 1 dimension of department
                    String department = salaryDepartmentHash.get(salary);

                    System.out.println(id + "\t\t\t" + name + "\t\t\t" + salary + "\t\t\t" + department);
                }
            }
        }
        System.out.println("-------------------------------------------------------------");
    }

    // add method
    public static void add(HashMap<Integer, HashMap<String, HashMap<Integer, String>>> employee){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter the Name: ");
        String name = input.nextLine();

        System.out.print("Enter the Salary: ");
        int salary = input.nextInt();
        input.nextLine();

        System.out.print("Enter the Department: ");
        String department = input.nextLine();

        // pass the value to 1D
        HashMap<Integer, String> salaryDepartment = new HashMap<>();
        salaryDepartment.put(salary, department);

        // pass value from 1D to 2D
        HashMap<String, HashMap<Integer, String>> nameTo1D = new HashMap<>();
        nameTo1D.put(name, salaryDepartment);

        // pass value from 2D to 3D
        employee.put(id, nameTo1D);
    }

    // delete method
    public static void delete(HashMap<Integer, HashMap<String, HashMap<Integer, String>>> employee){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID to delete employee Info: ");
        int idNum = input.nextInt();
        
        // check the id and remove from hash by id 
        if(employee.containsKey(idNum)){
            System.out.println(employee.remove(idNum));
        }
        else{
            System.out.println("The ID does not exist!");
        }
    }

    // update method
    public static void update(HashMap<Integer, HashMap<String, HashMap<Integer, String>>> employee) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID to update employee Info: ");
        int idNum = input.nextInt();
        input.nextLine();

        // check the id and update data
        if (employee.containsKey(idNum)) {
            System.out.print("Enter new employee name: ");
            String newName = input.nextLine();

            System.out.print("Enter new employee salary: ");
            int newSalary = input.nextInt();
            // clear buffer
            input.nextLine();

            System.out.print("Enter new employee department: ");
            String newDepartment = input.nextLine();

            // Update the maps
            HashMap<Integer, String> newSalaryDepartmentMap = new HashMap<>();
            newSalaryDepartmentMap.put(newSalary, newDepartment);

            HashMap<String, HashMap<Integer, String>> newNameMap = new HashMap<>();
            newNameMap.put(newName, newSalaryDepartmentMap);

            employee.put(idNum, newNameMap);
            System.out.println("Employee information updated successfully!");
        } else {
            System.out.println("The ID does not exist!");
        }
    }

    // search method
    public static void search(HashMap<Integer, HashMap<String, HashMap<Integer, String>>> employee) {
        // user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID to search employee Info: ");
        int idNum = input.nextInt();

        // check if the id exist or not 
        if (employee.containsKey(idNum)) {
            HashMap<String, HashMap<Integer, String>> idNameHash = employee.get(idNum);

            System.out.println("RESULT");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("ID\t\t\tName\t\t\tSalary\t\t\tDepartment");
            System.out.println("---------------------------------------------------------------------------------------");

            // access to all key of name 
            for (String name : idNameHash.keySet()) {
                HashMap<Integer, String> salaryDepartmentHash = idNameHash.get(name);

                // access to all key salary
                for (Integer salary : salaryDepartmentHash.keySet()) {
                    String department = salaryDepartmentHash.get(salary);

                    System.out.println(idNum + "\t\t\t" + name + "\t\t\t" + salary + "\t\t\t" + department);
                }
            }
            System.out.println("---------------------------------------------------------------------------------------");
        } else {
            System.out.println("The ID does not exist!");
        }
    }
    
    // exit program
    public static void exit(){
        System.out.println("The program exit successfully");
        System.exit(0);
    }
}