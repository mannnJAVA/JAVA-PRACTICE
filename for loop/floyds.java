import java.util.Scanner;

public class floyds {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***PRINTING floyds Triangle***\n\n Enter the value of n : ");
        int n=sc.nextInt();
        int k=1;
        System.out.println("Printing Floyds Triangle of "+n+" rows");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(k+" ");
                k++;
            }
          
            System.out.println();
           
            
        }
}
}
