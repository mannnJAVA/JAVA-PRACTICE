import java.util.Scanner;

public class rhombu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {

            for (int j =n; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n+2; k++) {
                System.out.print("*");
                
            }
             System.out.println();
        }
       
    }
}
