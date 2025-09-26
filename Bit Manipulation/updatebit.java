import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the position : ");
        int pos=sc.nextInt();
        
        int BitMask=1<<pos;


        if(n==1){
            int newNum=BitMask | n;
            System.out.println("New number is : "+newNum);
        }
        else{

           int newMask= ~(BitMask);
           int num= newMask & n;
            System.out.println("new number is : "+num);


        }
    }
}
