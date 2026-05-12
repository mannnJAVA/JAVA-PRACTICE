public class removeSpace {
  public static void main(String[] args) {
    String str = "h e l l o";
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        result += str.charAt(i);
      }

    }
    System.out.println(result);

  }
}
