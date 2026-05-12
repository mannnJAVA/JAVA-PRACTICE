public class palindromeStr {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "MaM";
    if (isPal(s2)) {
      System.out.printf("%s is palindrome.",s2);
    } else {
      System.out.printf("%s is not palindrome",s2);
    }
  }

  static boolean isPal(String str) {
  
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;

    }
    return true;
  }
}