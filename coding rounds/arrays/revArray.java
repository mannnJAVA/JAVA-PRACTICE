package arrays;

public class revArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println("Original array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Reversed array: ");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
