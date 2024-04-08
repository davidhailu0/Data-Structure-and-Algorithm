import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Abcd");
        queue.offer("zxccv");
        queue.offer("qwee");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
