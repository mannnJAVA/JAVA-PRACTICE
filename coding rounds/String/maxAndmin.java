public class maxAndmin {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 9, 1, 11, 12, 0 };
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Max element : " + max);
    System.out.println("Min element : " + min);
  }
}
