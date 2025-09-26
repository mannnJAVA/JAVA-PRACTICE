import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Toggle bit \nEnter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the position : ");
        int pos=sc.nextInt();
        
        int BitMask=1<<pos;
        int toggle = BitMask ^ n;
        System.out.println("Original Number : "+n);
        System.out.println("Original Bit : "+Integer.toBinaryString(n));
        System.out.println("Toggled Number : "+toggle);
        System.out.println("Toggled Bit : "+Integer.toBinaryString(toggle));

    }
}
