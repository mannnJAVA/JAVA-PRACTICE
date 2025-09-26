
import java.util.Scanner;

public class half {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.print("Printing half pyramid \n Enter the number of rows : ");
        int n=cs.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");
                
            }
          /* */ for (int k = 1; k <=i; k++) {
                System.out.print(k);                
            }
            for (int k = i; k>=1 ; k--) {
                System.out.print(k);
                
            }
            System.out.println();
            
        }
    }
}
