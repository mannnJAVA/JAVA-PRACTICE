public class smallest {
  public static void main(String[] args) {
    int[] arr = { 7, 2, 3, 4, 5 };
    System.out.println("Smallest array element : " + minArr(arr));
    int second = secondMin(arr);
    if(second != -1){
      System.out.println("Second smallest  element : " + second
      
    );}
  }

  static int minArr(int[] arr) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  static int secondMin(int[] arr) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < first) {
        second = first;
        first = arr[i];
      } else if (arr[i] < second && arr[i] != first) {
        second = arr[i];
      }
    }
    if (second == Integer.MAX_VALUE) {
      System.out.println("No second smallest element in array");
      return -1;
    }
    return second;
  }
}
