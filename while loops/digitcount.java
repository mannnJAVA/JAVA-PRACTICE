import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to count digits :");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        do { 
             

             temp=temp/10;
             count++;
             
        } while (temp!=0);
        System.out.println(count+" Digits");
    }
}
