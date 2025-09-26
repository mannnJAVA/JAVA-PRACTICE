
/*Write a function which takes in 2 numbers and returns the greater of those 
two. */
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Find the greatest of Three number \nEnter the num1 : ");
        int a=sc.nextInt();
        System.out.print("Enter num2 : ");
        int b=sc.nextInt();
        System.out.print("Enter num3 : ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest.");
        }
        else if (b>a && b>c){
            System.out.println(b+" is greast.");
        }
        else if(c>a && c>b){
            System.out.println(c+ " is greatest.");
        }
        else if ( a==b||a==c)System.out.println(" All numbers are equal.");
    }
}
