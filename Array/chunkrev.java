import java.util.Scanner;
public  class chunkrev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Reverse array in chunk \n Enter the  array : ");
        System.out.print("Enter the length : ");
        int n=sc.nextInt();
        int arr[]=new int[n];        for (int i = 0; i < n; i++) {
            
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the size of chunk : ");
        int k=sc.nextInt();

        for (int i = 0; i <n; i+=k) {

            int left=i;
            int right=i+k-1;
            if(right>=n){
                right=n-1;
            }
            while (left<right) { 
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            
            
        }
        for (int idx = 0; idx < n; idx++) {
            System.out.print(arr[idx]+" ");
                
            }
    }
}