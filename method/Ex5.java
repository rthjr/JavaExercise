import java.util.Scanner;

public class Ex5 {
    public static String removeSubstring(String substring, String string) {
        if (substring == null || string == null || substring.isEmpty()) {
            return string;
        }

        StringBuilder result = new StringBuilder();
        int index = 0;
        int lastIndex = 0;

        while ((index = string.indexOf(substring, lastIndex)) != -1) {
            result.append(string, lastIndex, index);
            lastIndex = index + substring.length();
        }

        result.append(string, lastIndex, string.length());

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String originalString = input.nextLine();
        System.out.print("Enter second string: ");
        String substringToRemove = input.nextLine();
        input.close();

        String stringWithoutSubstring = removeSubstring(substringToRemove, originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Substring to remove: " + substringToRemove);
        System.out.println("String without substring: " + stringWithoutSubstring);
    }
}
