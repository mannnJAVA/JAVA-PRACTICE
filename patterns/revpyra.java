import java.util.Scanner;

public class revpyra {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing half pyramid\n\nEnter the number of rows to print : ");
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
