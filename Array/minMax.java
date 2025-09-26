
import java.util.Scanner;

public class minMax {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Find the min and max number \n Enter size : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();          
      }
      
      for (int i = 0; i <arr.length; i++) {
          if(max<arr[i]) {
            max=arr[i];
        }

          if(min>arr[i]){
            min=arr[i];
        }

  }  
  System.err.print("Max number is : "+max+"\nMinimum number is : "+min);

}
}
