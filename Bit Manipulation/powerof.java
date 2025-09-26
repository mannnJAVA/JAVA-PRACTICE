import java.util.Scanner;
public class powerof{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the number having power of two or not\nEnter the number : ");
        int n=sc.nextInt();
        int pos=4;
        
        boolean isPower=true;
       if(n<=0){
        isPower=false;

       }
       int check=n &(n-1);
       if(check!=0){
            isPower=false;
       }

       if(isPower){
        System.out.println("Number "+n+" is power of two");
       }
       else{
        System.out.println("Number "+n+" is not power of two");

    
       }


    }
}