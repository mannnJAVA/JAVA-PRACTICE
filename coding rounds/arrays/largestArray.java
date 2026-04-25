import java.util.Scanner;
public class largestArray {
  public static void main(String[] args) {
    System.out.println("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    // for(int num : arr)
    // {
    //   if (num > max) {
    //     max = num;
    //   }
    // }
    System.out.println("The largest element in the array is: " + max);
  }
  
}
