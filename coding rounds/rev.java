
import java.util.Scanner;
public class rev{
  public static void main(String []args){
    System.out.println("Reverse a Number\n");
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    int rev = 0;
    int original = n;

    while(n>0){
      int digit = n % 10;
       rev = rev * 10 + digit;
        n = n/10;
    }
    System.out.print("Reversed number : " + rev);
    if (rev == original) {
      System.out.println("\nThe number is a palindrome.");
    } else {
      System.out.println("\nThe number is not a palindrome.");
    }
    sc.close();
  }
}