
import java.util.Scanner;

public class bazinga {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Check number is even or not \n Enter the number : ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Bazinga");
        }
        else{
            System.out.println("Number is not an even");
        }
    }
    
}
