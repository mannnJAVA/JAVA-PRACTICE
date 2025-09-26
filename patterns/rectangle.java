import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing Solid Rectangle pattern");
        System.out.print("Enter Breadth :");
        int b=sc.nextInt();
        System.out.print("Enter Length : ");
        int l=sc.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <=l; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    
}
