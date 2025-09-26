import java.util.Scanner;

public class home{
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of names you want to enter : ");
            int n=sc.nextInt();
            String name[]=new String[n];
            System.out.println("Enter names : ");
            for(int i=0;i<n;i++){
                name[i]=sc.next();
            }
            for (int i = 0; i <= name.length; i++) {
                System.out.println(i+" name is : "+name[i]);
                
            }
    }
}