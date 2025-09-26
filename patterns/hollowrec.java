
import java.util.Scanner;

public class hollowrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Printing hollow rectangle\n\nEnter the breadth : ");
        int b=sc.nextInt();
        System.out.print("Enter the length : ");
        int l=sc.nextInt();
          
            int k=0;
        
          
           for (int j = 1; j <= l; j++) {
               System.out.print("*");
           }
            System.out.println();

            for (int m = 1; m <=b-2; m++) {

                System.out.print("*");
                for (int n = 1; n < l-2; n++) {
                    System.out.print(" ");
                    
                }
                System.out.print("*");
                System.out.println();
                
            }
            if(b>1){
                for (int f = 1; f < l; f++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }
        }
    }

