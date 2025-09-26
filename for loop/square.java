import java.util.Scanner;

public class square {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing sum of n natural numbers from 1 to n\n Enter the value of n : ");
        int n =sc.nextInt();
        int k=0; 
        int f=0;
        for (int i = 0; i <=n; i++) {
                k=i*i;
                f=i*i*i;


            
        }
        System.out.println("Square of "+n+" is = "+k);
        System.out.println("Cube of "+n+" is = "+f);

    }
    
}
    

