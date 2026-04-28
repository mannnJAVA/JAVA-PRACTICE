import java.util.Arrays;
public class kthlargest {
  //using sorting
  public static void main(String[] args) {
    int[] arr = { 6, 7, 9, 3, 2, 10, 15 };
    int k = 3;
    Arrays.sort(arr);
    System.out.println(k+"th largest element is: "+arr[arr.length -k]);

  }
}
