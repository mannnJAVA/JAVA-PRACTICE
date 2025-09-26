
import java.util.Scanner;

public class bubbleSort {
    
    public static void main(Stringg[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int arr []=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
                        arr[idx]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
      for(int x : arr){
        System.out.print(x+" ");
      }
    }
}
