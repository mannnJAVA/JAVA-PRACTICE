import java.util.Scanner;
public class zero {
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
      System.out.print("Reverse array \n\nEnter size of the array : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.print("Enter array : ");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

      }
      int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[count]=arr[i];
            count++;
                  
        }
        
        }
        while(count<arr.length){
            arr[count++]=0;
        }
         System.out.print("Result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

