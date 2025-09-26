import java.util.Scanner;

public class pyramid {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing pyramid\n\nEnter the number of rows to print : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
           for (int space = 0; space <=n-i; space++) {
               System.out.print(" ");
           }
            for (int j = 1; j <=i*2-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
