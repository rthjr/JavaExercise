public class Ex4 {
    public static void main(String[] args) {
        String sentence = "Hello, this is a test!";

        String[] words = split(sentence);

        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] split(String sentence) {
        int wordCount = countWords(sentence);
        String[] words = new String[wordCount];

        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0); // Clear the StringBuilder for the next word
                }
            }
        }

        // Add the last word if it's not empty
        if (word.length() > 0) {
            words[index] = word.toString();
        }

        System.out.println(wordCount);

        return words;
    }

    public static int countWords(String sentence) {
        int count = 0;
        boolean inWord = false;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}
