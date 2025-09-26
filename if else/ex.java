import java.util.*;

public class ex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of an integer a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
 
        else {

            System.out.println(a + " is equal to " + b);
        }
             if (b>a){
            System.out.println(b + "is greater than "+a);
        }
        else  {
            System.out.println(a + " equals to " + b);
        }

    }

}
