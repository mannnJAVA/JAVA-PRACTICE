
import java.lang.reflect.Array;
import java.util.Arrays;

public class kthsmallest {
  public static void main(String[] args) {
    int[] arr = { 9, 7, 4, 1, 3 };
    int k = 3;
    Arrays.sort(arr);
    System.out.println(k+"th smallest element is : "+arr[k-1]);

  }
}
//time complexity O(n log n)