import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Check the number is even or odd using bit manipulation\nEnter the number : ");
        int n=sc.nextInt();
        if((n&1)==1){
            System.out.println(n+" is odd.");
        }
        else{
            System.out.println(n+" is even.");
        }
    }
}
