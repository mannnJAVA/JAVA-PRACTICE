import java.util.Scanner;

public class revchunk {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
      System.out.print("Find reverse array in chunk of size k  \n Enter size : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

      }
      System.out.print("Enter the size of chunk : ");
      int chunk=sc.nextInt();
      n=arr.length;
      for (int i = 0; i <n; i+=chunk) {
        int left=i;
        int right=i+chunk-1;
        if(right>=n){
          right=n-1;
        }
        while(left<right){
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          left++;
          right--;
        } 
      }
      for (int idx = 0; idx < n; idx++) {
              System.out.println(arr[idx]);
          
      }
    }
}
