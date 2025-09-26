
import java.util.Scanner;

public class hollowButterfly {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Print Hollow ButterFly \n Enter the number of rows to print  : ");
        int n=sc.nextInt();

    for (int i = 1; i <=n; i++) {
                for (int j =1; j <=i; j++) {
                    
                    if(i==1 || j==1 || j==i ){
                    System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                for (int space = n+3; space >=i*2; space--) {
                    System.out.print(" ");
                    
                }
                for (int k = i; k >=1; k--) {
                    if(i==1 || k==1 || k==i){
                    System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
                for (int i = n; i >=1; i--) {
                for (int j =1; j <=i; j++) {
                    
                    if(i==1 || j==1 || j==i ){
                    System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                for (int space = n+3; space >=i*2; space--) {
                    System.out.print(" ");
                    
                }
                for (int k = i; k >=1; k--) {
                    if(i==1 || k==1 || k==i){
                    System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
}
}
