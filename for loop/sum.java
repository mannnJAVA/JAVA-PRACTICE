import java.util.Scanner;
import javax.crypto.KDF;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing sum of n natural numbers from 1 to n\n Enter the value of n : ");
        int n =sc.nextInt();
        int k=0;
        for (int i = 0; i <=n; i++) {
                k+=i;

            

            
        }            System.out.println("sum of natural numbers from 1 to "+n+" is = "+k);

    }
    
}
