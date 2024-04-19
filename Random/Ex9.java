import java.util.Arrays;
import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        int[] playerShots = new int[6];

        // todo represents the barrel with bullets
        boolean[] barrel = new boolean[6];

        // todo out 5 bullets into the barrel
        for (int j = 0; j < 5; j++) {
            barrel[j] = true;
        }

        // play 1000 times
        for (int i = 0; i < 1000; i++) {

            // shoot 6 people
            for (int k = 0; k < playerShots.length; k++) {

                // role the barrel
                Random rand = new Random();
                for (int j = 0; j < barrel.length; j++) {
                    int index = rand.nextInt(6); 

                    if(j == index){
                        continue;
                    }

                    boolean temp = barrel[index];
                    barrel[index] = barrel[j];
                    barrel[j] = temp;
                }

                // Simulate shooting
                if (barrel[k] == true) {
                    barrel[k] = false;
                    playerShots[k]++;
                }
            }
            // reload the bullet
            for (int j = 0; j < 5; j++) {
                barrel[j] = true;
            }
        }
        
        System.out.println("The Number of dead in each index: " + Arrays.toString(playerShots));    
    }
}
