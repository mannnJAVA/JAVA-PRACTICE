import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print odd numbers between 1 to n \n Enter value of n : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i%2==0) {

            }
            else {System.out.println(i+"");}
        }
    }
    
}
