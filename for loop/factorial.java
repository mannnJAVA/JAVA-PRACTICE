import java.util.Scanner;

public class factorial {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find Factorial \n\n Enter the value of n : ");
        int n =sc.nextInt();
        int k=1;
        for (int i = 1; i <=n; i++) {
                k*=i;

            

            
        }  
System.out.println("Factorial of "+n+" is = "+k);

    }
    
}
    

