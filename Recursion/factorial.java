
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Calculate factorial of the number \nEnter the number : ");
        int n=sc.nextInt();
        System.out.print("Factorial of "+n+" is : "+fact(n));
    }
    public static int fact(int n){
        if(1>=n || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
