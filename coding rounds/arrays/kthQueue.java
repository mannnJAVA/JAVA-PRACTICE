import java.util.Collections;
import java.util.PriorityQueue;
public class kthQueue {
  //kth largest using priority queue
  public static void main(String[] args) {
    int[] arr = { 1, 4, 6, 14, 21, 32, 11 };
    int k = 2;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int n : arr) {
      pq.add(n);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    System.out.println(k+"th largest element is : "+pq.peek());
  }
}
