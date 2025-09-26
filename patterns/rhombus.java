import java.util.Scanner;

public class rhombus {
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing number Rhombus\n\nEnter the number of rows to print : ");
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int k = 0; k <=n+2; k++) {

                System.out.print("*");
                
            }
            System.out.println();
        }
}
}