
import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Print Factorial\n\nEnter the number:");
        int n=sc.nextInt();
        int k=1;
        int i=1;
         while(i<=n){

            k=k*i;
            
            i++;
            System.out.println(i);
        }
        System.out.print("Factorial is :"+k);
        
    }

}
