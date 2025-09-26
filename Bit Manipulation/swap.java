
import java.util.Scanner;

//Swap two numbers without using a temporary variable.
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Swap numbers \n\nEnter num1:");
        int num1=sc.nextInt();
        System.out.print("Enter num2:");
        int num2=sc.nextInt();
        
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;

        System.out.println("\n\nSwaped numbers are: \nnum1 = "+num1+"\nnum2 = "+num2);
    }
}
