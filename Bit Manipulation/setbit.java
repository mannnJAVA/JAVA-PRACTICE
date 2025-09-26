
import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Set bit\n Enter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the position : ");
        int pos=sc.nextInt();
        int BitMask=1<<pos;
        int newNum=BitMask | n;
        System.out.println("New number after setting bit : "+newNum);
        System.out.println("Original binary: " + Integer.toBinaryString(n));
System.out.println("New binary     : " + Integer.toBinaryString(newNum));


    }
    
}
