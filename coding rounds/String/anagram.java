import java.util.Arrays;

public class anagram {
  public static void main(String[] args) {
      String str1 = "listen";
  String str2 = "sileat";
  boolean isanagram = true;
  if(str1.length() != str2.length())
  {
    isanagram = false;

  }
  
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    if (Arrays.equals(ch1, ch2)) {
      isanagram = true;
    } else {
      isanagram = false;
    }
  

  if(isanagram)
  {
    System.out.println("Anagram");
  }else
  {
    System.out.println("Not Anagram");
  }
  }
  
}
