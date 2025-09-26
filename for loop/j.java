
import java.util.Scanner;

public class j {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n");
    int n=sc.nextInt();
    for (int j = n; j >=1; j--) 
            {
                for (int k = 1; k <=n-j; k++) {
                    System.out.print(" ");
                    
                }
                for (int l =1; l <=2*j-1; l++) {
                    System.out.print("*");
                }
                            System.out.println(

            }
    }
}
);