import java.util.Scanner;

public class sumo {
    public static void main(String[] args) {
        Scanner sc=new  Scanner (System.in);
        System.out.println("Pritn sum of odd numbers between 1 to n \n Enter the value of n :");
        int n =sc.nextInt();
        int k=0;
        System.out.println("odd numbers are :  ");

        for (int i = 0; i < n; i++) {
            if(i%2==0){


            }
            else{
                k+=i;
                System.out.println(" "+i);
            }
            
        }
        System.out.println("sum of odd numbers is : "+k);
    }
}
