import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // todo create variable
        int ranNum1 = (int) (Math.random() * 100) + 1;
        int ranNum2 = (int) (Math.random() * 100) + 1;
        int calculator = ranNum1 + ranNum2;
        int userInput;
        Scanner input = new Scanner(System.in);
        int[] previousNUm = new int[100];
        int count = 0;

        do {
            // todo input
            data.calculator(ranNum1, ranNum2);
            userInput = input.nextInt();

            // todo check if the num already input
            for(int i = 0; i < previousNUm.length; i++){
                if(previousNUm[i] == userInput){
                    data.alreadyEnter();
                    System.out.print(previousNUm[i] + "\n");
                    break;
                }
            }

            previousNUm[count] = userInput;

            // todo try again
            if(calculator != userInput){
                data.enterAgain();
            }else{
                data.correct();
            }
            count++;

        } while (calculator != userInput);

        input.close();
    }

    // todo method definition
    static class data {
        public static void calculator(int ranNum1, int ranNum2) {
            System.out.print("What is " + ranNum1 + " + " + ranNum2 + "? ");
        }

        public static void enterAgain() {
            System.out.print("Wrong Answer. Try again. ");
        }

        public static void alreadyEnter() {
            System.out.print("You already enter: ");
        }

        public static void correct() {
            System.out.print("You got it!!!!");
        }
    }

}
