

import java.util.LinkedList;
import java.util.Queue;


//mplement a Queue using LinkedList

public class q1 {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.poll();
        System.out.println(q);
    }

}
