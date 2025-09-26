import java.util.Scanner;

public class tablel {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    System.out.print("Print the Multiplication table \n Enter the number : ");
    int n=sc.nextInt();
     tabel(n);
    }
    public static void tabel(int f) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number to end table : ");
        int n=r.nextInt();
        for (int i =1; i <=n; i++) {
System.out.println(f+" x "+i+" = "+f*i);
            
        }
    }
    
}
