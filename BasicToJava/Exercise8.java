package BasicToJava;
public class Exercise8 {
    public static void main(String[] args)
    {
        double a = 1;
        double sum = 0;
        while(a <= 97)
        {
            sum += a / (a + 2);
            a += 2;   
        }
        System.out.println("sum " + sum);
    }
}
