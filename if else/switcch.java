
import java.util.Scanner;

public class switcch {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Select button :");
        int b=sc.nextInt();
        switch (b) {
            case 1: System.out.println("!!!Hello!!!");

                
                break;
                case 2: System.out.print("         !\n        !  !\n       !  !  !\n     !  !  !  !\n   ! ! Namaste ! !\n     !  !  !  !\n       !  !  !\n        !  !\n         !");
                break;
            default:
                System.out.println("Invalid ");
        }
    }
    
}
