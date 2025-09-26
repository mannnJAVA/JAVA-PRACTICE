import java.util.Scanner;

public class homework{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,n,o;
        do{
                System.out.println("Select option 1 or 0\n\n1.Enter student marks.\n0.Exit");
                o=sc.nextInt();

        switch (o){
           
           case 1:  System.out.print("Enter student marks : ");
                     s=sc.nextInt();
                        System.out.println("\n");
                        if(s> 100) System.out.println("Invalid Marks!\n\n");
                        else if(s>=80) System.out.println("Excellent\n\n");
                        else if(s>=60) System.out.println("Very good\n\n");
                        else if(s>=40) System.out.println("Good\n\n");
                        else System.out.println("Better luck next time\nMarks dont matter but your efforts dose\n\n");
                    
                     break;
           case 0: System.out.println("Exiting...");
                     break;
        
           default: System.out.println("Invalid !");break;

        }
    }while(o==1);

        
    }
}