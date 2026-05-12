import java.util.Scanner;
public class Armstrong {
  public static void main(String[] args) {
    System.out.println("Armstrong Number\n");



    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      if(isArmstrong(i)) System.out.println(i);
    }

  }

  static boolean isArmstrong(int n) {
   
    int count = 0;
    int original = n;
    int temp = n;
    n = Math.abs(n);// handle negative
    while (temp > 0) {
      temp /= 10;
      count++;
    }
    int sum = 0;
    temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      sum += (int) Math.pow(digit, count);
      temp /= 10;
    }
    return original == sum;
    
    
  }
}
