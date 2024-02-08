package CharactersAndStrings;
import java.util.Scanner;

public class Exercise1 {
    public void str() {
        System.out.println("Enter the word:");
        Scanner input = new Scanner(System.in);
        String b = input.nextLine();
        int length = b.length();
        input.close();

        StringBuilder modified = new StringBuilder();
        for (int index = 0; index < length; index++) {

            char ch, nextCh;

            ch = b.charAt(index);
            nextCh = (char) (ch + 1);

            if (ch == ' ') {
                nextCh = ' ';
            }
            if (ch == 'z') {
                nextCh = 'a';
            }
            modified.append(nextCh);

        }

        System.out.println(modified);
    }

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        obj.str();
    }
}
