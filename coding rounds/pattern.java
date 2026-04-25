import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    System.err.println("Enter the number of rows : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {

      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");

      }
      for (int j = 1; j <= i*2-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
