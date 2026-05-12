public class primeSum {
  public static void main(String[] args) {
    int n = 50;
    for (int i = 0; i <= n / 2; i++) {
      if (isprime(i) && isprime(n - i)) {
        System.out.println(n+" = "+i+" + "+" "+(n-i));
      }
    }

  }

  static boolean isprime(int n) {
    if (n <= 1)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;

    }
    return true;
  }
}
