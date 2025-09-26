
import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the value of n : ");
       int n=sc.nextInt();
       System.out.print("\nSum of first "+n+" natural number is : ");
        sumOfnatural(1, n, 0);
      
     

    }
    public static void sumOfnatural(int i,int n,int sum) {
       if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
       }
        sum+=i;
        sumOfnatural(i+1,n,sum);
    }
}
