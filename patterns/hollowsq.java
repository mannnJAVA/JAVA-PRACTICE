import java.util.Scanner;

public class hollowsq {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.print("Printing hollow square\n\nEnter the side : ");
        int b=sc.nextInt();

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <=b; j++) {
                if(i==1 || i==b || j==1 || j==b)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            
        }
          
    }
}
