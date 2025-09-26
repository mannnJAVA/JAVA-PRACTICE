import java.util.Scanner;
public class dimond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Printing Diamond Pattern\n Enter the number of rows to print: ");
            int n=sc.nextInt();
            for (int i = 1; i <=n; i++) {
                for (int space =1; space <=n-i; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i*2-1; j++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }
            for (int i = n-1; i >=1; i--) {
                for (int space =1; space <=n-i; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i*2-1; j++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }
    }
}
