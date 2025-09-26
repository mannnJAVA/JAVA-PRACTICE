
import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Check the number is even or not\n\nEnter the number:  ");
        int n=sc.nextInt();
        evenn(n);
    }
    public static void evenn(int n) {

            if(n%2==0){
                System.out.println(n+" is even number");
            }
            else System.out.println(n+" is not even");
            
        }
        
    
}
