import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing Even Numbers between 1 to n Numbers\n  Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("Printing Even numbers between 1 and "+n);
        for (int i = 1; i < n; i++) {
            if (i%2==0){
                System.out.println(i+"");
            }

            
        }
    }
}
