import java.util.Scanner;

public class evencount {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
      System.out.print("Find the min and max number \n Enter size : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

      }
      int count=0;
      for (int i = 0; i <= arr.length-1; i++) {
        if(arr[i]%2==0){

            count++;
        }
          
      }
      System.out.print("Count of even numbers in array is : "+count);


    }
}
