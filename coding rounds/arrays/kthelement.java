import java.util.Collections;
import java.util.PriorityQueue;

public class kthelement {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 3, 5 ,8};
    int k = 6;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : arr) {
      pq.add(num);
      if (pq.size() > k) {
        pq.poll();
      }

    }
    pq.peek();
    System.out.println(k + "th smallest element is : " + pq.peek());
  }
}
