import java.util.*;
public class copyArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int[] copy = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }
    System.out.println("copy :"+Arrays.toString(copy));
    for (int n : copy) {
      System.out.print(n + " ");
    }
  }
}
