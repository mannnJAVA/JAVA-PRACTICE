import java.util.Scanner;

public class doublePyram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Printing Same number Pyramid\n Enter the number of rows to print: ");
            int n=sc.nextInt();
            for (int i = 1; i <=n; i++) {
                for (int space = n; space >=i; space--) {
                    System.out.print(" ");
                }
                
                for (int j = 1; j <=i*2-1; j++) {
                    System.out.print(i);
                    
                }
                System.out.println();
            }
    }
}
