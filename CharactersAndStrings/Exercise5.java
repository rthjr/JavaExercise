package CharactersAndStrings;
public class Exercise5 {
    public static void main(String[] args) {

        //    define the variable
        String acid = "ACDEFGHIKLMNPQRSTVWY";
        String protein = "GIVEQCCTSICSLYQLENYCNFVNQHLCGSHLVEALYLVCGERGFFYTPKTNQHERGFFYTPKSICSLYQLVCGEVEQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCNFVNQHLCGSHLVEALYLVCGERGFFYTPKTNQHERGFFYTPKSICSLYQLVCGEVEQCCTTSICSLYLCGSQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCNFVNQHL"; 
        int count = 0;

        //    defind the domain of acid 
        for( int i = 0; i < acid.length(); i++){

            //     defind the domain of protein 
            for( int j = 0; j < protein.length(); j++ ){

                //    access each acid element to check all the exist element of protein
                if ( acid.charAt(i) == protein.charAt(j)){
                    count++;
                }
            }
          
            System.out.println(acid.charAt(i) + " : " + count);  
            count = 0;
        }
    }   
}