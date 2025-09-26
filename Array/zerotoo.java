import java.util.Scanner;

public class zerotoo {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.println("Print the sum of array \nEnter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i]=sc.nextInt();
            
        } 
        int count=0;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]!=0){
                int temp=arr[idx];
                arr[idx]=arr[count];
                arr[count]=temp;
                count++;
            } 
        }
        for (int idx = 0; idx < arr.length; idx++) {
         System.out.println(arr[idx]);

            
        }


    }
}
