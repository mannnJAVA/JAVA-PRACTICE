import java.util.Scanner;

public class sum {
  public static void main(String[] args) {

    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.print("Sum of the digit is : " + sum(n));

  }

  static int sum(int n) {
    
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      n = n / 10;
    }
    return sum;
  }
}
