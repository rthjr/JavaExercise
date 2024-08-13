import java.io.FileReader;
import java.io.FileWriter;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Before change");
        reader();
        writer();

        System.out.println("After change");
        reader();
    }
    static void reader(){
        try{
            int i;
            FileReader read = new FileReader("File/Document.txt");
            while((i = read.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println();
            read.close();
        }catch(Exception e){
            System.out.println("Error reading to file: " + e.getMessage());
        }
    }

    static void writer() {
        try{
            FileWriter write = new FileWriter("File/Document.txt");
            write.write("Hello, World!");
            write.close();
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
