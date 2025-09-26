
/*Write a function that takes in age as input and returns if that person is eligible 
to vote or not. A person of age > 18 is eligible to vote.  */
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Check the eligibility for voting \n Enter the age : ");
        int age=sc.nextInt();
        agee(age);
    }
   public static void agee(int a) {
       
   
        if(a> 18 && a <150){
            System.out.println("Your Eligible to vote.");
        }
        else if (a <18){
            System.out.println("You are Not Eligible to vote\n! Minor ! ");
        }
        else System.out.println(" INVALID !...");
        
    }
}
