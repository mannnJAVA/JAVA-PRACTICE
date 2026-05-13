
import java.util.HashSet;

public class removeDup {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> dups = new HashSet<>();

    for (int num : arr) {
      if (!seen.add(num)) {
        dups.add(num);
      }
    }
    System.out.print("Duplicate removed : " + seen);
    System.out.print("Duplicates are : " + dups);
  }
}
