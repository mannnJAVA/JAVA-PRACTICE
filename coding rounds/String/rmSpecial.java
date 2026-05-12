public class rmSpecial {
  public static void main(String[] args) {
    String str = "h@ e%llo";
    String result = "";
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        result += ch;
      }
      // if (Character.isLetter(ch)) {
      //   result += ch;
      // }
    }
    System.out.println(result);
  }
}
