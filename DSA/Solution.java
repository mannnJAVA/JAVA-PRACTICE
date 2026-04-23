
import java.util.Scanner;

class Solution {

  public Boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] freq = new int[26];
    
  }

  // public static Integer findSecondLargest(int[] nums) {
  //   if (nums == null || nums.length < 2) {
  //     return null;
  //   }
  //   int first = Integer.MIN_VALUE;
  //   int second = Integer.MIN_VALUE;

  //   for (int n : nums) {
  //     if (n > first) {
  //       second = first;
  //       first = n;

  //     } else if (n < first && n < second) {
  //       second = n;
  //     }
  //   }
  //   return second;
  // }
 

  // public static void main (
  //   String[] args
  // ) {
  //   System.out.println("Enter no of rows : ");
  //   Scanner sc = new Scanner(System.in);
  //   int n = sc.nextInt();
  //   // for (int i = n; i >=1; i--) {
  //   //   for (int j = 1; j <= i; j++) {
  //   //     System.out.print("* ");
  //   //   }
  //   //   System.out.println();
  //   // }
  //   for (int i = 1; i <= n; i++) {
  //     for(int j= i; j<=n; j++) {
  //       System.out.print("* ");
  //     }
  //     System.out.println();
  //   }
  // }

}
