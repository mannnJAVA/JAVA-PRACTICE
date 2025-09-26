import java.util.Scanner;

public class hollowPyramid {
     public static void main(String[] args) {
    
         Scanner sc=new Scanner(System.in);
        System.out.print("Printing hollow Pyramid\n\nEnter the number of rows : ");
        int b=sc.nextInt();
       
int m=1;
        for (int i = 1; i <= b; i++) {
            for(int j=1;j<=b-i;j++){
                System.out.print(" ");
            }
            m=i-1;
            for (int k = 1; k <=i*2-1; k++) {

                if(i==1 || i==b|| k==1 || k==m+i ){
                System.out.print("*");
            }
            else {System.out.print(" ");}
            }
           System.out.println();
            }
            
  
        }
}
