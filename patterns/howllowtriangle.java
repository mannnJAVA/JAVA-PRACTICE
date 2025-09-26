import java.util.Scanner;

public class howllowtriangle {
    public static void main(String[] args) {
    
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing hollow Triangle\n\nEnter the number of rows : ");
        int b=sc.nextInt();
       
int m=0;
        for (int i = 1; i <= b; i++) {
            
            
            for (int k = 1; k <=i; k++) {
                 m=i+k;
                if(i==1 || i==b || k==1 || k==i ){
                System.out.print("*");
            }
            else {System.out.print(" ");}
            }
           System.out.println();
            }
            
  
        }

    
    }

