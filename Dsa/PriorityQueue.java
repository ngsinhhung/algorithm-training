
import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        // Queue<Double> priorityQueue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        // priorityQueue.offer(3.5);
        // priorityQueue.offer(2.5);
        // priorityQueue.offer(4.0);
        // priorityQueue.offer(1.5);
        // priorityQueue.offer(2.0);

        Queue<String> priorityQueue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer("A");
        priorityQueue.offer("C");
        priorityQueue.offer("B");
        priorityQueue.offer("E");
        priorityQueue.offer("H");



        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }

}
