import java.util.Scanner;

public class sume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print Sum of Even numbers from 1 to n\n Enter the value of n : ");
        int n=sc.nextInt();
        int k=0;
        
        System.out.println("Even numbers are : ");
        for (int i = 2; i < n; i++) {
            if(i%2==0){
                k+=i;
                System.out.println(i+" ");
            }                

            
        }System.out.println("sum of even numbers is : "+k);
    }
    
}
