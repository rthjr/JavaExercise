import java.util.ArrayList;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        // a 3-by-4 2D ArrayList of floating-point numbers in the range 100.00, 200.99
        ArrayList<ArrayList<Double>> array2D = new ArrayList<>();
        Random randNum = new Random();
        
        for (int i = 0; i < 3; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(randNum.nextDouble() * 100.00 + (200.99 - 100.00));
            }
            array2D.add(row);
        }
        
        // the generated 2D ArrayList
        System.out.println("Generated 3-by-4 2D ArrayList:");
        for (ArrayList<Double> row : array2D) {
            for (Double num : row) {
                System.out.printf("%.2f ", num);
            }
            System.out.println();
        }
        
        // the smallest element and its location
        ArrayList<Integer> location = locateSmallest(array2D);
        System.out.println("The location of the smallest element is at row " + location.get(0) + " and column " + location.get(1));
    }
    
    public static ArrayList<Integer> locateSmallest(ArrayList<ArrayList<Double>> array2D) {
        int smallRow = 0;
        int smallCol = 0;
        double smallValue = array2D.get(0).get(0);
        
        // find the smallest number in 2darray
        for (int i = 1; i < array2D.size(); i++) {
            for (int j = 1; j < array2D.get(i).size(); j++) {
                if (array2D.get(i).get(j) < smallValue) {
                    smallValue = array2D.get(i).get(j);
                    smallRow = i;
                    smallCol = j;
                }
            }
        }
        
        ArrayList<Integer> location = new ArrayList<>();
        location.add(smallRow);
        location.add(smallCol);
        return location;
    }
}
