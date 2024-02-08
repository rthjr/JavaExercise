package BasicToJava;
import java.lang.Math;

public class Exercise9 {
    public static void main(String[] args)
    {
        double a = 1;
        double sum = 0;
        while(a <= 624)
        {
            sum += (1 / (Math.sqrt(a) + Math.sqrt(a + 1)));
            a += 1;
        }
        System.out.println("sum " + sum);
    }
}
