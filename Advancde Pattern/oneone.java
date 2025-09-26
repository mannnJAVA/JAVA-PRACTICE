import java.util.Scanner;

public class oneone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Reverse number triangle\n Enter the number of rows : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=n-i; j++) {
                System.out.print(i);
                
            }
            System.out.println();
            
        }
    }
}
