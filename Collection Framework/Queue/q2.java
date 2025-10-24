//Reverse a Queue (Using Stack)

import java.util.LinkedList;
import  java.util.Queue;
import java.util.Stack;

public class q2 {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        for (int i = 0; i <= 10; i++) q.offer(i);

            Stack<Integer> s= new Stack<>();
            while(!q.isEmpty()) s.push(q.poll());
            while(!s.isEmpty()) q.offer(q.poll());


        
    }
}
