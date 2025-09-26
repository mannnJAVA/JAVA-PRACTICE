
import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print Fibonacci Sequence up to n number \n\nEnter the number  : ");
        int n = sc.nextInt();
        int num1=0,num2=1;
        
        for (int i = 1; i <= n; i++) {

            int next=num1+num2;// sum of first two numbers.
            num1=num2;         // updating num1 with num2.
            num2=next;         // updating num2 with next number.
            System.out.println(num1);
            }

        }
    }

