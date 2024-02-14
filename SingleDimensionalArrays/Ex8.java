package SingleDimensionalArrays;

public class Ex8 {
    public static void main(String[] args) {

        boolean[] lockers = new boolean[50];

        // todo at the first index
        lockers[0] = true;

        // todo adjust the open and close lockers
        for (int i = 3; i <= lockers.length; i++) {
            
            for (int k = i; k <= lockers.length; k += i) { 
                lockers[k - 1] = !lockers[k - 1]; 
            }
            
        }


        // todo print the result
        int countTrue = 0;
        int countAll = 0;
        for (boolean result : lockers) {
            if(result == true){  
                countTrue++;
            }
            countAll++;
            System.out.println(result);
        }

        System.out.println(countTrue);
        System.out.println(countAll);
        
    }
}
