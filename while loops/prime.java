import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Print Prime numbers upto n \n\nEnter the value of n:");
    int n=sc.nextInt();
    boolean isPrime=true;
    int i=2;
    if(n<=1)System.out.println("Not Prime");
    if(n==2)System.out.println(n+" is Prime");
    while(i<=n/2){
            
        if(n%i==0) {isPrime=false;break;}
        
        i++;
    }

        if(isPrime) System.out.println(n+" is Prime.");

        else System.out.println(n+" is Not Prime");
        
        
}
}    
    

