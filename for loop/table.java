
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("****Print Multiplicaion Table****\n Enter the Number :");
        int n = sc.nextInt();
        System.out.println("Printing Multiplication Table of "+n );

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+n+" = "+(i*n));
            
        }
    }
    
}
