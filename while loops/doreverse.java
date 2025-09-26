
import java.util.Scanner;

public class doreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Reverse The Number\n\nEnter the Number to Reverse : ");
        int n=sc.nextInt();
        int temp=n;
        int reversed=0;

        do{
            int k;
            k=temp%10;
            reversed=reversed*10+k;
            temp=temp/10;


        }while(temp!=0);
        System.out.println("Reversed Number is : "+reversed);

    }
}
