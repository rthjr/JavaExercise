
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Ex1 {
    public static void main(String[] args) {
        File file = new File("TxtFile/Countries.txt");

        // check the file txt exist or not
        boolean fileChecker = file.exists();

        try {
            // check if the file exists or not
            if (!fileChecker) {
                file.createNewFile();
                System.out.println("File created successfully");
            } else {
                // write section
                writeData();

                // read section
                readData();

            }
        } catch (Exception e) {
            System.out.println("e");
        }
    }

    // write data
    static void writeData() {
        try {
            // create write file
            FileWriter writer = new FileWriter("TxtFile/Countries.txt");
            writer.write("Cambodia\n");
            writer.write("Thailand\n");
            writer.write("China\n");
            writer.write("Japan\n");
            writer.write("Canada\n");
            writer.write("Singapore\n");
            writer.write("Turkey\n");
            writer.write("Columbia\n");
            writer.write("Australia\n");

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // read data
    static void readData() {

        // variable use to get the value of each char of file
        int i;

        // use to count the character of "a"
        int count = 0;

        // while "i" get the value of each char as ASCII value
        // and store in the array char
        try {
            FileReader reader = new FileReader("TxtFile/Countries.txt");
            char[] tranferChar = new char[100];
            // fill tranfer char all index to nul
            for (int k = 0; k < tranferChar.length; k++) {
                tranferChar[k] = 'n';
            }
            int j = 0;

            while ((i = reader.read()) != -1) {
                tranferChar[j] = (char) i;
                j += 1;
            } 
           
            // count the cuntries when it end with character [a]
            for (int k = 0; k < 100; k++) {
                int temp = k - 1;
                if (tranferChar[k] != 'n') {
                    if ((tranferChar[k] == '\n')) {
                        if (tranferChar[temp] == 'a') {
                            count += 1;
                        }

                    }
                }

            }
            
            System.out.println("There are " + count + " countries that end with letter [a]");

            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}