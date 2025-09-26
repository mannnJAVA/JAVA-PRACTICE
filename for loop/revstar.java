
import java.util.Scanner;

public class revstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing Reverse star pattern \nEnter the value of n :");
        int n=sc.nextInt();
        for (int i = n; i >= 1; --i) {
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
           
                
            System.out.println("");
            
        }
    }
    
}
