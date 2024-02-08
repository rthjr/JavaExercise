package CharactersAndStrings;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder obj = new StringBuilder();
        String name = input.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'i' || name.charAt(i) == 'e' || name.charAt(i) == 'o'|| name.charAt(i) == 'u') {
                obj.append(name.charAt(i));
            }
        }
        System.out.println(obj);
        input.close();
    }
}
