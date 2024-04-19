import java.util.PriorityQueue;

public class Ex8withQueue {

    public static void main(String[] args) {
        // Create a priority queue with a custom comparator for reverse order (biggest
        // first)
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> queue2 = new PriorityQueue<>((a, b) -> b - a);

        

        // Add 20 random numbers to the queue
        for (int i = 0; i < 20; i++) {
            queue.add(randomNum());
        }
        for (int element : queue) {
            queue2.add(element);
        }
        
        int result = 0;
        int temp;
        for (int i = 0; i < 2; i++) {
            temp = queue.poll();
            if (i == 1) {
                result = temp;
            }
        }

        System.out.println("the second largest is : " + result);

        // Print all elements from biggest to smallest
        while (!queue2.isEmpty()) {
            System.out.print(queue2.poll() + " ");
        }
    }

    public static int randomNum() {
        int length = (int) ((Math.random() * 100) + 1);
        return length;
    }
}
