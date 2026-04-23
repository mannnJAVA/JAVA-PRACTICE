import java.util.Scanner;
public class count {

  //Count the digits in a number
  public static void main(String[] args) {
    System.out.println("Count the digits in a number\n");
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digit = digits(n);
    System.out.print("Total Digits : " + digit);
    
  }

  static int digits(int n) {
    n = Math.abs(n);
    if (n == 0)
      return 1;
      int count = 0;
    while (n > 0) {
   
      n = n / 10;
      count++;
    }
    return count;
  }
}
