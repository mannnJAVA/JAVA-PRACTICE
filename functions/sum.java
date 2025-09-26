
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sum of two numbers \n Enter a : ");
        int a =sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is : "+sum(a,b));
    }
    public static int sum(int a,int b) {
        
        return a+b;

    }
}
