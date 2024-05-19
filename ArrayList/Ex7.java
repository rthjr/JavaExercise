import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

    //  prime number
    static boolean isPrime(int num) {

        // prime num start from 2
        if (num <= 1) {
            return false;
        }

        // range of prime num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


    //  check if a number is emirp and reverse num
    static boolean isEmirp(int num) {
        int revers = 0;
        int renum = num;
        while (renum != 0) {
            revers = revers * 10 + renum % 10;
            renum /= 10;
        }
        return num != revers && isPrime(num) && isPrime(revers);
    }
    

    public static void main(String[] args) {

        // amount of display
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of emirps for the program to generate: ");
        int n = input.nextInt();
        input.close();

        // create an arrayList to store the emirps
        ArrayList<Integer> emirps = new ArrayList<>();
        int num = 13; 
        while (emirps.size() < n) {
            if (isEmirp(num)) {
                emirps.add(num);
            }
            num++;
        }

        // print 10 line each
        for (int i = 0; i < emirps.size(); i++) {
            if (i > 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(emirps.get(i) + " ");
        }
    }
}
