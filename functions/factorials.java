import java.util.Scanner;

public class factorials{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    System.out.print("Find Factorial \n Enter the number : ");
    int n=sc.nextInt();
     factorial(n);
    }
    public static void factorial(int f) {
        int fact=1;
        for (int i =1; i <=f; i++) {
            fact*=i;

            
        }
        System.out.println("Factorial of "+f+" is : "+fact);
    }
}