import java.util.Scanner;

public class palindrotwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Printing Same Palindromic Pyramid\n Enter the number of rows to print: ");
            int n=sc.nextInt();
            int p=0;
            for (int i = 1; i <=n; i++) {

                for (int space = n; space >=i; space--) {//or for(int space =1 ; spaace<=n-i ; space ++)

                    System.out.print(" ");
                    
                }
                for (int j = i; j >=1; j--) {
                    
                    System.out.print(j);
                    
                }
                for (int l = 2; l <=i; l++) {
                    System.out.print(l);
                }
                System.out.println();
            }
    }
}
