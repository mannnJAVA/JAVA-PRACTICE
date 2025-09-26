
import java.util.Scanner;

public class hollowRomb {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        System.out.print("Printing HOllow Rhombus \nEnter the number of rows to print : ");
        int n=tc.nextInt();
        for (int i =1; i <= n; i++) {

            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for(int k=1;k<=n+2; k++){
                if(i==1||k==1||i==n||k==n+2){
                    System.out.print("*");
                }
                else {System.out.print(" ");}
            }
            System.out.println();
            
        }
    }
}
