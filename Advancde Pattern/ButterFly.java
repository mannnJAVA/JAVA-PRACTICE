/*Butterfly star pattern */
import java.util.Scanner;


public class ButterFly {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n+5; k>=i*2; k--) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* for (int i = 1; i <= n; i++) {

            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
           for (int k = 1; k<=i*2; k++) {
                System.out.print(" ");
            }
             for (int l = n; l >= i; l--) {
                System.out.print("*");
            } */
             for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n+5; k>=i*2; k--) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
