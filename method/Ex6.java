import java.util.Scanner;

public class Ex6 {
    final static String[] num1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    final static String[] num2 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    final static String[] num3 = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    final static String[] num4 = {"", "thousand", "million", "billion"};

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        String verboseNumber = verbose(number);
        System.out.println(verboseNumber);
    }

    public static String verbose(int num) {
        if (num == 0) {
            return "zero";
        }

        String words = "";
        int count = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words = convertToWordsHelper(num % 1000) + (num % 1000 != 0 ? num4[count] + " " : "") + words;
            }
            num /= 1000;
            count++;
        }

        return words.trim();
    }

    public static String convertToWordsHelper(int num) {
        String words = "";

        if (num >= 100) {
            words += num1[num / 100] + " hundred ";
            num %= 100;
        }

        if (num >= 11 && num <= 19) {
            words += num2[num - 10] + " ";
            return words;
        } else if (num == 10 || num >= 20) {
            words += num3[num / 10] + " ";
            num %= 10;
        }

        if (num > 0) {
            words += num1[num] + " ";
        }

        return words;
    }
}
