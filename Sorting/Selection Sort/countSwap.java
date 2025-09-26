import java.util.Scanner;
public class countSwap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Count swaps of selection sort");
        System.out.print("\n\nEnter the Length of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("\nEnter Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int count=0;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if(arr[min]>arr[j]){
                min=j;
                
                }
            }
           if(min!=i){ int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            count++;
           }
        }
        System.out.println("Sorted array : ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("\nCount of swap is : "+count);

        
    }
}