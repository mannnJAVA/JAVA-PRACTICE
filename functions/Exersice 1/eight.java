
/*  Two numbers are entered by the user, x and n. Write a function to find 
the value of one number raised to the power of another i.e. .  */
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find the value of power of number \n\n Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the power to the number  : ");
        int p = sc.nextInt();
                int m = 1;

        for (int i = 1; i <= p; i++) {
            // System.out.println(i);
            //System.out.println(n+" n ");

            m=m*n;

    }
           System.out.println(n+" to the power "+p+" is : "+m);

}
}
