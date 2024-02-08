package BasicToJava;
public class Exercise5 {

    public static void main(String[] args) {
        int targetValue = 10000;
        int n = 0;

        //infinit loop
        while (true) {
            int cube = n * n * n;
            if (cube < targetValue) {
                n += 2; 
            } else {
                n -= 2; 
                break; 
            }
        }
        // Display the result
        System.out.println("The largest even integer n such that n³ is less than 10000 is: " + n);
    }
}
