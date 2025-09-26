import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print the sum of array \nEnter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i]=sc.nextInt();
            
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
         double avg=(double)(sum/n);
        System.out.println("Sum of array is : "+sum);
        //System.out.println("Average of array is : "+avg);
        n=arr.length;
        System.out.printf("Average of array is: %.2f%n", avg);

    }
}
