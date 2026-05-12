public class StringOP {
  public static void main(String[] args) {
    String str = "hello Mangesh 1234 ";
    str = str.toLowerCase();
    int vowels =0, consonant = 0,digits =0, space =0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowels++;

        } else {
          consonant++;
        }
      } else if (ch >= '0' && ch <= '9') {
        digits++;

      } else if (ch == ' ') {
        space++;
      }

    }
    System.out.println("vowels : "+vowels+"\nconsonants : "+consonant+"\ndigits : "+digits+"\nspaces : "+space);
  }
}
