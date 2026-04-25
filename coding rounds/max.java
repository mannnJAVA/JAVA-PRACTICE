import java.util.Scanner;

public class max {
  public static void main(String[] args) {
    System.out.println("Enter the value of an array : ");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements of an array : ");

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Maximum element in the array is : " +

        maxArr(arr));
  }

  static int maxArr(int arr[]) {
    int max = arr[0];
    // for (int i : arr) {
    //   if (i > max)
    //     max = i;

    // }
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

}
