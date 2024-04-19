import java.util.Arrays;
import java.util.Scanner;

class Ex3 {
    static String string1;
    static String string2;

    
    // todo input the value
    static void inPut() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        string1 = input.nextLine();
        System.out.print("Enter String 2: ");
        string2 = input.nextLine();
        input.close();
    }

    //  todo check the anagram
    static Boolean isAnagram() {
        if (string1.length() != string2.length()) {
            return false;
        }

        char[] strCh1 = string1.toCharArray();
        char[] strCh2 = string2.toCharArray();

        Arrays.sort(strCh1);
        Arrays.sort(strCh2);

        return Arrays.equals(strCh1, strCh2);
    }

    public static void main(String[] args) {
        inPut();
        System.out.println(isAnagram());
    }
}