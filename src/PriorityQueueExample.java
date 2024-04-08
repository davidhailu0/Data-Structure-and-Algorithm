import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    // it puts the elemes in order
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("zxcvb");
        queue.offer("ghjhjh");
        queue.offer("Abcd");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
