
import java.util.Scanner;

public class circle {
    public static void main(String args[]) {
        System.out.println("Calculate the circumference and area of the circle\n Enter the radius of the circle : \n");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double c = 2 * 3.14 * r;
        double a = 3.14 * (r * r);

        System.out.println("Circumference of the circle :" + c);
        System.out.println("Area of the circle is :" + a);

    }
}
