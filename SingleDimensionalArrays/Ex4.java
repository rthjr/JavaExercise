import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        // size array 
        int size = 5;

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] split = string.split(" ");
        input.close();

        int[] scores = new int[size];

        for(int i = 0; i < size; i++){
            scores[i] = Integer.valueOf(split[i]);
        }

        // set scores to grade
        for(int i = 0; i < size; i++){
            if(scores[i] >= 90){

                System.out.println("Score is " + scores[i] + " and grade is A");
            }else if(scores[i] < 90 && scores[i] >= 80){

                System.out.println("Score is " + scores[i] + " and grade is B");
            }else if(scores[i] < 80 && scores[i] >= 70){

                System.out.println("Score is " + scores[i] + " and grade is C");
            }else if(scores[i] < 70 && scores[i] >= 60){

                System.out.println("Score is " + scores[i] + " and grade is D");
            }else{
                System.out.println("Score is " + scores[i] + " and grade is F");
            }
        }
    }
}


