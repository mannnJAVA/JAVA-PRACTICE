import java.util.Scanner;
public class countdown {
  public static void main(String[] args){
    System.out.print("Enter the the number :");
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.print("Count Down Begins : ");
    cd(n);


  }
  static void cd(int n)  {
    for (int i = n; i >= 0; i--) {
      System.out.println(i);
      try{
              Thread.sleep(1000);

            } catch (InterruptedException e) {
              System.out.println("Countdown interrupted");
      }

    }
    
  }
}
