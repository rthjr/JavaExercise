import java.util.Scanner;
import java.util.ArrayList;

class Ex5{


    // user input
    static void userIn(ArrayList<String> people){
        System.out.println("Enter the name of User: ");
        int length = 3;

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < length; i++){
            people.add(input.nextLine());
        }

        // add more name 
        boolean yesno = true;
        while(yesno){
            System.out.println("Would you link to add another person? (yes/no)");
            String temp = input.nextLine();

            if(temp.equals("yes")){
                System.out.println("Enter the person name: ");
                people.add(input.nextLine());

            }else{
                yesno = false;
            }
        }


        input.close();
    }

    // print result
    static void print(ArrayList<String> people){
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
    }

    public static void main(String[] args){
        ArrayList<String> people = new ArrayList<>();

        userIn(people);

        System.out.println("You have invited "+ people.size() + " people to the party. They are: ");
        print(people);
    }
}
