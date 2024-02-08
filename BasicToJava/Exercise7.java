package BasicToJava;


public class Exercise7
{
    public static void main(String[] atgs)
    {
        int count = 0;
        //  set the domain loop
        System.out.println("Devided by 5");
    	for(int domainNum = 100; domainNum <= 200; domainNum++)
        {
            if((domainNum % 5 == 0) && !(domainNum % 5 == 0 && domainNum % 6 == 0))
            {
                System.out.print(domainNum + " ");
                count++;
            }
            if(count == 10)
            {
                System.out.println();
                count = 0;
            }
        }

        count = 0;
        System.out.println("\n\nDevided by 6");
        for(int domainNum = 100; domainNum <= 200; domainNum++)
        {
            if((domainNum % 6 == 0) && !(domainNum % 5 == 0 && domainNum % 6 == 0))
            {
                System.out.print(domainNum + " ");
                count++;
            }
            if(count == 10)
            {
                System.out.println();
                count = 0;
            }
        }
        
    }
}