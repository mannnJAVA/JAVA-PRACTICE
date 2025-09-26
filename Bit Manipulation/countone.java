import java.util.Scanner;

public class countone {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("Count of one's (1) in number\nEnter the number : ");
        int n=sc.nextInt();
        int count=0;
       while(n>0){
        if((n&1)==1){
            count++;
        }
        n=n>>1;
       }
       System.out.println("Count of one's(1) is : "+count);
        
    }
}
