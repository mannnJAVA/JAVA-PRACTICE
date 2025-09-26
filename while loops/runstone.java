
import java.util.Random;
import java.util.Scanner;

public class runstone {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("     !!!  RUNSTONE  !!!   \n\n");
        Random rand=new Random();
        
        int j;
        
        int num=rand.nextInt(100)+1;

       do{
          System.out.print("1.Start the game\n2.Exit\n");
        j=sc.nextInt();
        switch(j){
            case 1 :  System.out.println("Guess the random number between 1 to 100\n\n");

           // System.out.println(num);
               for (int i = 1; i <= num; i++) {
            System.out.print("Enter number:");
             int k=sc.nextInt();
            if(k==num){System.out.println("\n \n  ***BINGO***\n\nNumber "+k+" = "+num+"\n\n");break;}

            else if(k>num)System.out.println("Number is less than "+k);
            else if (k<num) System.out.println("Number is greater than "+k);
            else break;
             
        }
            break;
          case 2 : System.out.println("Exiting...");
               break;
       default:System.out.println("Invalid !!!");
         
        } 
    }while(j==1);
    
}
}
