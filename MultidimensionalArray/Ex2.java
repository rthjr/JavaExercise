

public class Ex2 {
    public static void main(String[] args) {
       // todo set variable and multi array
       int[][] multiArray = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9},
       };
       int length = multiArray.length;
   
       // todo print all the diagonal
       for(int i = 0; i < length + 2; i++){
   
           // todo (build-in) compare and get the small row
           int startRow = Math.min(i, length - 1);
   
           // todo (build-in) compare and get the hight col
           int startCol = Math.max(0, i - length + 1);
   
           // todo set value to rwo and col
           int row = startRow;
           int col = startCol;
   
           // todo access the array
           while(row >= 0 && col < length){
               
               System.out.print("[" + row + "]" + "[" + col + "] : " + multiArray[row][col] + " ");
               
               // todo to rotate row and col
               row--;
               col++;
           }
           System.out.println();
       }
    }   
   }
   