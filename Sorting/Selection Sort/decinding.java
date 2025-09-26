import java.util.Scanner;

public class decinding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Selection sort in decending order\n\n");
        System.out.print("Enter the length of an array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    for (int i = 0; i <n; i++) {
        int max=i;
        for (int j = i+1; j < n; j++) {
            if(arr[max]<arr[j]){
                max=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[max];
        arr[max]=temp;
        
    }
    System.out.println("Array in sorted decending order using selection sort");
    for(int a:arr){
        System.out.print(a+" ");
    }
    
    }
}
