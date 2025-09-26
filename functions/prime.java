
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Check Number is Prime or not \n Enter the number : ");
        int n=sc.nextInt();
        primes(n);
    }
    public static void primes(int n) {
        boolean isPrime=true;
            if (n<=1){isPrime=false;}
            else{
               if(n==2){isPrime=true;}
            else if(n%2==0){isPrime=false;}
            else{
        for (int i = 3; i*i <= n; i+=2) {
          if(n%i==0){
            isPrime=false;
            break;
          }

            
        }
      }
        System.out.println(n+(isPrime ?" is Prime" : " is not Prime"));
        
       
    }
        
    }

}
