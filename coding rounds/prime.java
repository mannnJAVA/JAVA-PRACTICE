import java.util.Scanner;
public class prime {

  public static void main(String[] args) {
 
    System.out.println("Enter the nth no: ");
    Scanner sc = new Scanner(System.in);
    int nth = sc.nextInt();
    int j = 2;
    int count = 0;
    while (true) {
      if (isPrime(j)) {
        count++;
        if (count == nth) {
          System.out.println(nth + "th prime is : " + j);
          break;
        }
      }
      j++;
    }
    System.out.println("Printing consecutive prime numbers");
    int t = sc.nextInt();
    int c=0;
    int i = 2;
    int prev = -1;
    while (c < t) {
      if (isPrime(i)) {
        if (prev != -1) {
          System.out.println(prev + " " + i);
        }
        c++;
         prev = i;
      }
      i++;
   }
  
  }
  
  static boolean isPrime(int n) {
    if (n <= 1)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
  

}