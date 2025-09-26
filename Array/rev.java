import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        
    
           Scanner sc=new Scanner(System.in);
      System.out.print("Reverse array \n\nEnter size of the array : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.print("Enter array : ");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

      }
      System.out.print("\nReversed array : ");
      for (int i = arr.length-1; i >=0; i--) {
        System.out.print(arr[i]+" ");

          
      }
    
}
}
