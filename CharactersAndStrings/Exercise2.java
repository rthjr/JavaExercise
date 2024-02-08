package CharactersAndStrings;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word with mixed uppercase and lowercase letters: ");
        String word = input.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                result.append(" ");  // Insert a space before the capital letter
            }
            
            result.append(word.charAt(i));
        }

        System.out.println("Word with spaces: " + result);
        input.close();
    }
}
