package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLink {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue: "+queue);
        System.out.println("Revoved : "+queue.poll());
        System.out.println("Next element: "+ queue.peek());
    }
}
