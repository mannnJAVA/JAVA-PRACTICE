public class linearSearch {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 6, 7 };
    int key = 3;
    boolean found = false;

    for (int n : arr) {
      if (n == key){
        found = true;
      break;}
    }
    if (found) {
      System.out.print("found");
    } else {
      System.out.print("Not found");
    }
  }
  
}
