
//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of all odd numbers between 1 to n\n\nEnter the value of n : ");
        int n = sc.nextInt();
        odd(n);
    }

    public static void odd(int n) {
        int sum = 0;
       /* for (int i =1 ; i <= n; i+=2) {
        sum+=i;
        System.out.println(i);
        System.out.println("\n");
        } */ 
       for (int i = 1; i <=n; i++) {
           if(i%2!=0){
            sum+=i;
           }
       }
        
        System.out.println("Sum of odd numbers between 1 to " + n + " is : " + sum);

    }
}