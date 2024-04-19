
public class Ex10 {
    static int[] getNum;

    // convert string to integer
    public static void split(String userInput) {
        String[] tokens = userInput.split(" ");
        getNum = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            getNum[i] = Integer.parseInt(tokens[i]);

            if (getNum[i] > 10) {
                System.exit(0);
            }
        }

    }

    // put item in container
    public static void container() {
        int containerIndex = 1; // Index for the current container

        // container
        int temp = 0;
        System.out.print("Container " + containerIndex + " contain items: ");
        for (int i = 0; i < getNum.length; i++) {
            temp += getNum[i];
            System.out.print(getNum[i] + " ");
            if (i + 1 < getNum.length && temp + getNum[i + 1] > 10) {
                System.out.println();
                containerIndex++;
                temp = 0; // reset temp for the next container
                if (i + 2 < getNum.length) {
                    System.out.print("Container " + containerIndex + " contain items: ");
                }
            }
        }
        System.out.println("\nThere are: " + containerIndex + " container.");
    }

    public static void main(String[] args) {
        System.out.println("Enter the item weight: ");
        String userInput = "3 9 7 1 5 3";

        split(userInput);
        container();
    }
}
