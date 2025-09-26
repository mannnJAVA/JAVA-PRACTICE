import java.util.Scanner;

public class dopass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pwd;
        do { 
        
            System.out.println("Enter The Password");
            pwd=sc.nextLine();
            if(!pwd.equals("Kali@123")) System.out.println("Invalid Password !\n\n Try Again...");

        } while (!pwd.equals("Kali@123"));
        System.out.println("****Welcome Mangesh****");
    }
}
