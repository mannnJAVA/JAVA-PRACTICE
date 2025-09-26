
import java.util.Scanner;

public class pyra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***PRINTING STAR PYRAMID***\n\n Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("Printing Pyramid of "+n+" rows");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
                
            }
            for (int t = 1; t <=2*i-1; t++) {

                System.out.print("*");
            }
            System.out.println();
           
            
        }
           /*   for (int j = n; j >=1; j--) 
            {
                for (int k = 1; k <=n-j; k++) {
                    System.out.print(" ");
                    
                }
                for (int l =1; l <=2*j-1; l++) {
                    System.out.print("*");
                }
                            System.out.println();

            }*/
    }
         
    }

