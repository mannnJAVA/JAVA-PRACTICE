public class missingnumber {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4,5};
    int n = arr.length + 1;
    int totalsum = n * (n + 1) / 2;
    int actualsum = 0;
    for (int num : arr) {
      actualsum += num;
    }
    int missing = totalsum - actualsum;
    System.out.println("missing element is : "+missing);
  }
}
