public class merge {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3 };
    int[] b = { 4, 5, 6 };

    int[] c = new int[a.length + b.length];
    int index = 0;
    for (int n : a) {
      c[index++] = n;
    }
    for (int n : b) {
      c[index++] = n;
    }
    System.out.print("Merged array : ");
    for (int n : c) {
      System.out.print(n+" ");
    }
  }
}
