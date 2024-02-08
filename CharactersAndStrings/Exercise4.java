package CharactersAndStrings;
import java.util.Scanner;

public class Exercise4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the the word or number.");
        String word = input.nextLine();

        StringBuilder obj = new StringBuilder(word);
        obj.reverse();
        System.out.println(obj);



        for ( int i = 0; i < word.length();){
            if( word.charAt(i) == obj.charAt(i)){
                System.out.println("palindrome");
                break;
            }
            else{
                System.out.println("it is not palindrome.");
                break;
            }
        }
        input.close();
    }
}