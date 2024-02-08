package CharactersAndStrings;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        // create obj scanner and insert variable
        System.out.println("Input:");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        input.close();

        // create obj sstringbuilder and store valur of string to obj
        StringBuilder obj = new StringBuilder(string);
        System.out.println(obj);

        // loop each index of i with all index of j
        for (int i = 0; i < obj.length(); i++) {
            
            // convert stirng to char 
            char ch = obj.charAt(i);

            for (int j = i + 1; j < obj.length(); j++) {

                // convert string of obj to ch  
                char chCompare = obj.charAt(j);

                // to compare the big and small letter
                if (ch == chCompare || Character.toLowerCase(ch) == chCompare || Character.toUpperCase(ch) == chCompare) {

                    // delete at value from the index from string obj
                    obj.deleteCharAt(j);

                    // when the valur beign delete the value of next index will come to the previous index
                    j--; 

                }
            }
        }

        System.out.println("Result:" + obj);
    }
}





// import java.util.Scanner;

// public class Ex1 {
//     public static void main(String[] args) {

//         // create Scanner obj and Input string
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String string = input.nextLine();
//         input.close();

//         // convert the input string to lowercase
//         String stringConverter = string.toLowerCase();

//         // stringBuilder to store unique characters
//         StringBuilder result = new StringBuilder();

//         // iterate through each character in the original string
//         for (int i = 0; i < string.length(); i++) {

//             // convert the current character to lowercase
//             char chConverter = stringConverter.charAt(i);

//             // get the current character from the original string
//             char ch = string.charAt(i);

//             // check if the lowercase version of the character is not already in the StringBuilder string
//             if (result.indexOf(String.valueOf(chConverter)) == -1) {
//                 // append the original character to the result string
//                 result.append(ch);
//             }
//         }

//         // Print the result string
//         System.out.println("Result: " + result);
//     }
// }
