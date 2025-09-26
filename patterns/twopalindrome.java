import java.util.Scanner;

public class twopalindrome {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing number pyramid\n\nEnter the number of rows to print : ");
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int k =i; k >=1; k--) {

                System.out.print(k);
                
            }
         for (int m = 2; m<= i; m++) {
                
                System.out.print(m);
            }
            System.out.println();
        }
    }
    
}
