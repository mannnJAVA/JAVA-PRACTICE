import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the position : ");
        int pos=sc.nextInt();

        int BitMask=1<<pos;
        int NewMask= ~(BitMask);
        int newNum=NewMask & n;
        System.out.println("New Number is : "+newNum);
        System.out.println("Original Binary : "+Integer.toBinaryString(n));
        System.out.println("New Binary : "+Integer.toBinaryString(newNum));

    }
}
