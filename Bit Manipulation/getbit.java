
import java.util.Scanner;

public class getbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the position : ");
        int pos=sc.nextInt();
        
        int BitMask=1<<pos;
        if((n & BitMask)==0){
            System.out.println("Bit was 1");
        }
        else{
            System.out.println("Bit was 1");
        }
        
    }
}
