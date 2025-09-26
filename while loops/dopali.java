import java.util.Scanner;

public class dopali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check Palindrome number. \n\nEnter the number : ");
            int n=sc.nextInt();
            int temp=n;
            int palidrome=0;
            do { 
                int digit=temp%10;
                palidrome=palidrome*10+digit;
                temp=temp/10;

            } while (temp!=0);
            if(palidrome==n) System.out.println("Number is Palindrome\n "+n+" = "+palidrome );
            else System.out.println("Number is not Palindrome !");
    }
}
