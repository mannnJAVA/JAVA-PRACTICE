import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n=sc.nextInt();
        System.out.print("Enter array : ");
        int arr []=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
                        arr[idx]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if((arr[j]%2!= 0 && arr[j+1]%2==0 )|| ((arr[j]%2==arr[j+1]%2) && arr[j]>arr[j+1])){
                    
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    
                }

            }
            
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
