
import java.util.Scanner;

//Brian kernighan's Algorithm
public class countset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Count of set bits");
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int m=n;
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++; // clear the rightmost set bit
            
        }
        System.out.println("The number of set bits in "+m+" are :"+count);
    }
}
