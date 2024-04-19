import java.lang.Math;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        // todo create a variable 
        double[][] points = { 
                                {-1, 0}, 
                                {-1, -1}, 
                                {4, 1}, 
                                {2, 0.5}, 
                                {3.5, 2}, 
                                {3, 1.5}, 
                                {-1.5, 4}, 
                                {5.5, 4} 
                            };
        double maxDistance = 0, distance;
        int[] result = new int[2];
        int i, j;


        for(i = 0; i < points.length; i++){
            for(j = i + 1; j < points.length; j++){
                distance = Math.sqrt(Math.pow(points[j][0] - points[i][0], 2) + Math.pow(points[j][1] - points[i][1], 2));
                if(distance > maxDistance){
                    maxDistance = distance;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        
        System.out.println("The longest distance is between points:");
        System.out.println(Arrays.toString(points[result[0]]) + " \t " + Arrays.toString(points[result[1]]));
    }
}
