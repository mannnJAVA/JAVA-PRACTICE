public class remDup {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 3, 4, 5, 4, 5, 6 };


    for (int i = 0; i < arr.length; i++) {

      boolean dups = false;

      for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] == arr[j]) {
          dups = true;
          

          break;
        }

      }
      if (!dups) {
        System.out.print(arr[i] + " ");
      }

    }
   
  }
}
