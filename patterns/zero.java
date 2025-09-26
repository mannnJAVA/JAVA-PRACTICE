import java.util.Scanner;

public class zero {
public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing half pyramid\n\nEnter the number of rows to print : ");
        int n=sc.nextInt();
        int k=0;
        int l=1;
        //System.out.println("0");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
       // System.out.print(k);System.out.print(l);
              /*if(j%2==0)System.out.print("0");
               else System.out.print("1"); */
               if((i+j)%2==0) System.out.print("1");
               else System.out.print("0");
            }
            System.out.println();
        }
}
}
