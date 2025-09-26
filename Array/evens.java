import java.util.Scanner;

public class evens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.print("Find the min and max number \n Enter size : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

      }
      int esum=0;
      int osum=0;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i]%2==0){
            
            esum+=arr[i];
          }
          else{
            System.out.println("\nOdd numbers are : "+arr[i]);
                osum+=arr[i];
          }
      }
      System.out.print("\n\nSum of even numbers is : "+esum+"\n Sum of Odd numbers is : "+osum);
      
    }
}
