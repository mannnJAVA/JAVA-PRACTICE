import java.util.*;

public class bubblesort {
  public static void main(String[] args) {
    System.out.print("Enter the length of an array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int[] arr = new int[n];
    System.out.println("Enter array elements : ");
  
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Array : " + Arrays.toString(arr));
    
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      System.out.print("Sorted array : ");
      for (int num : arr) {
        System.out.println(num+" ");
      }
        
    }

  }
}
