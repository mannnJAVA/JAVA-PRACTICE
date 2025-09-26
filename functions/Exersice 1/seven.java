
/* Write a program to enter the numbers till the user wants and at the end it 
should display the count of positive, negative and zeros entered.   */
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("count of positive ,negative & zeros\n\n");
        int p=0,n=0,z=0;
        char choice;
        do { 
            System.out.print("Enter the number : ");
            int num=sc.nextInt();
            if(num>0){
                p++;
            }
            else if (num<0){
                n++;
            }
            else { z++;}
            System.out.println("Do you want to continue y/n : ");
            choice =sc.next().trim().toLowerCase().charAt(0);
            
        } while (choice=='y');
        System.out.print("Summarry : \n\n 1. Count of Positive Numbers is : "+p+"\n2. Count of Negative Numbers is : "+n+"\n3. Count of Zero's is : "+z);

    }
}
