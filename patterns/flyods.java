import java.util.Scanner;

public class flyods {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing half pyramid\n\nEnter the number of rows to print : ");
        int n=sc.nextInt();
     int k= 0;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
    }
}
