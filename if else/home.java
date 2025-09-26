
import java.util.Scanner;

public class home{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Options \n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Modulo\nEnter Option :");
      int choice=sc.nextInt();
      int a,b;
      switch (choice) {
          case 1: System.out.print("++++Addition++++\n\nEnter the value of a : ");
                    a=sc.nextInt();

                    System.out.print("Enter the value of b : ");
                     b=sc.nextInt();

                     int c=a+b;

                     System.out.print("Sum of " +a+ " and " +b+ " is :"+c);
              
              break;

          case 2 : System.out.print("----Substraction----\n\nEnter the value of a:" );
                            a=sc.nextInt();
                            System.out.print("Enter the value of b : ");
                     b=sc.nextInt();

                     int d=a-b;

                     System.out.print( +a+ " minus " +b+ " is : "+d);

                     break;

          case 3:  System.out.print("****Mulplication****\n\nEnter the value of a:" );
                            a=sc.nextInt();
                            System.out.print("Enter the value of b : ");
                     b=sc.nextInt();

                     int m=a*b;

                     System.out.print( "Multicplication of "+a+ " & " +b+ " is : "+m);
                     break;
              
        case 4:  System.out.print("////Division////\n\n Enter the value of a:" );
                            a=sc.nextInt();
                            System.out.print("Enter the value of b : ");
                     b=sc.nextInt();

                     int l=a/b;

                     System.out.print( "Division of "+a+ " by " +b+ " is : "+l);
                     break;

        case 5:  System.out.print("% % % Modulo % % %\n\n Enter the value of a:" );
                            a=sc.nextInt();
                            System.out.print("Enter the value of b : ");
                     b=sc.nextInt();

                     int mod=a%b;

                     System.out.print( "Modulo Division of "+a+ " by " +b+ " is : "+mod);
                     break;

          default:
              System.out.println("!!!! Invalid Option !!!!");
      }
      
    }
    
}
