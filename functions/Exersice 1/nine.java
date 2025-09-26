
import java.util.Scanner;

public class nine {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Find Greatest Common Divisor of two numbers (GCD)\n\nEnter num1 : ");
        int a=sc.nextInt();
        System.out.print("Enter num2 : ");
        int b=sc.nextInt();
        int m=1;
                    for(int i=1; i<=a && i<=b;i++){

                    if(a%i==0 && b%i==0){
                        
                            m=i;
                        
                    }

           
                    }
                    System.out.println("GCD is : "+m);
            

        }
    }


