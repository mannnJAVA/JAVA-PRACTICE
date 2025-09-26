import java.util.Scanner;

public class sentile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int i = 0;
        int j=0;
        do {
            System.out.print("Enter Numbers to add : ");
            k = sc.nextInt();
            j = k + j;
            System.out.println("sum = " + j);
            i++;

        } while (k >= 1);
    }

}
