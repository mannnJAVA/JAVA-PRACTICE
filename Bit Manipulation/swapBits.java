import java.util.Scanner;
public class swapBits {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("Swap Bits \n\nEnter Number:");
        int n=sc.nextInt();
        System.out.print("Binary of "+n+" : "+Integer.toBinaryString(n));
        System.out.print("\n\nEnter the positions to be swap\nEnter position 1 : ");
        int p1=sc.nextInt();
        System.out.print("\nEnter position 2 : ");
        int p2=sc.nextInt();

        int bit1=(n>>p1)&1;//extraxting bit at position 1
        int bit2=(n>>p2)&1;//extracting bit at position 2 

        if(bit1!=bit2){
            int mask=(1<<p1) | (1<<p2);
            n=n^mask;
        }
       /* int mask1=1<<p1;
        int mask2=1<<p2;

        int firstSwap=mask1 ^ n;
        int secondSwap=firstSwap^mask2;*/
        System.out.println("Swapped bits are : "+Integer.toBinaryString(n));
         
    }
}
