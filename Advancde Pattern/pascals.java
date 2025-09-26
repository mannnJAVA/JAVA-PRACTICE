import java.util.Scanner;

public class pascals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing Pascals Triangle \n Enter the number of rows to print  : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {

            for (int j = n; j >= i; j--) {// or j=1; j<=n-i; j++

                System.out.print(" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                int sum=i;
                System.out.print(sum);
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l);

            }

            System.out.println();

        }
    }
}
