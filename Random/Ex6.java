public class Ex6{
    public static void main(String[] args) {
        // todo create a domain and variable
        final int games = 100;
        int winA = 0;
        int winB = 0;
        int randomA;
        int randomB;

        // todo find who is win and who is lost
        for(int i = 0; i < games; i++){
            randomA = (int)(Math.random() * 3) + 1;
            randomB = (int)(Math.random() * 3) + 1;
           
            if(randomA == randomB){
                winA++;
            }
            else if(randomA != randomB){
                winB++;
            }
        }

        // todo print the result
        System.out.println("A: " + winA);
        System.out.println("B: " + winB );

        // todo compare who win 
        if(winA > winB){
            System.out.println("The winner is person A: " + winA);
        }else{
            System.out.println("The winner is personB: " + winB);
        }
    }
}