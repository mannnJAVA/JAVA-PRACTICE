
import java.util.Scanner;


public class one {
    //Enter 3 numbers from the user & make a function to print their average.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Average of three numbers \n\nEnter num1 : ");
        int a=sc.nextInt();
        System.out.print("Enter num2 : ");
        int b=sc.nextInt();
        System.out.print("Enter num3 : ");
        int c=sc.nextInt();
        average(a,b,c);
    }
    public static void average(int a,int b,int c) {

        float avg= (a+b+c)/3;
        System.out.println("Average is : "+avg);
        
    }
}
