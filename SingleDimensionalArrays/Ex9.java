package SingleDimensionalArrays;

public class Ex9 {
    public static void main(String[] args) {
        // todo create variable
        String sentence = "www.google.com";
        String[] words = sentence.split("[,.!?\\s]"); // Split by any combination of punctuation and spaces

        // todo reverse each word in the array
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
               char temp = chars[left];
               chars[left] = chars[right];
               chars[right] = temp;
               left++;
               right--;
            }
            words[i] = String.valueOf(chars); // assign the reversed word back to the array
        }

        // todo print the result and add its special characher
        String result = String.join(".", words); // join the words with a dot
        System.out.println(result); // print the result
    }
}


