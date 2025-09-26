/*Write a function that takes in the radius as input and returns the 
circumference of a circle.*/
import java.util.Scanner;
public class four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Find the circumference of the Circle\n Enter the radius of the circle : ");
        float r=sc.nextFloat();
       
        System.out.println("Cirumference of the circle is : "+circumference(r));  
    }
    public static double circumference(double a ) {
      
         return 2*3.14*a;
        
    }
}
