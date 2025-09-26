
    
import java.util.Scanner;

public class homm{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
     
      int a,b;

    System.out.print("Enter the value of a:\n" );
     
    a=sc.nextInt();
                            
     System.out.print("Enter the value of b : ");
                     
     b=sc.nextInt();

     int c=a+b;
      int d=a-b;
      int m=a*b;
      double l=a/b;
       double mod=a%b;

    System.out.println("Options \n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Modulo\nEnter Option :");
      
    int choice=sc.nextInt();
      
      switch (choice) {
          case 1: System.out.print("++++Addition++++\n");
                
                    System.out.print("Sum of " +a+ " and " +b+ " is :"+c);
              
              break;

          case 2 : System.out.print("----Substraction----\n");
                    

                     System.out.print( +a+ " minus " +b+ " is : "+d);

                     break;

          case 3:  System.out.print("****Mulplication****\n" );
                     

                     System.out.print( "Multicplication of "+a+ " & " +b+ " is : "+m);
                     break;
              
        case 4:  System.out.print("////Division////\n" );
                            
        System.out.print( "Division of "+a+ " by " +b+ " is : "+l);
                     break;

        case 5:  System.out.print("% % % Modulo % % %\n" );
                            
        System.out.print( "Modulo Division of "+a+ " by " +b+ " is : "+mod);
                     break;

          default:
              System.out.println("!!!! Invalid Option !!!!");
      }
      
    }
    
}

    

