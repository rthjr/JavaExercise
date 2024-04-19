public class Ex2 {

    // create palindrome method
    public static boolean generateEvenNumeralPalindrome(String string) {
        StringBuilder reverse = new StringBuilder(string).reverse();
        return string.equals(reverse.toString());
    }

    // output
    public static void output(String[] num){
        
        // Print the generated palindromes
        for (String palindrome : num) {
            if (palindrome != null) {
                System.out.print(palindrome + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] num = new String[10]; // Initialize with size 10, as you only need to store 10 palindromes
        int index = 0;
        for (int i = 0; i <= 202; i += 2) {
            if (generateEvenNumeralPalindrome(Integer.toString(i))) {
                num[index] = Integer.toString(i);
                index++;
            }
        }

        output(num);
    }
}
