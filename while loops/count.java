import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Down\n\nEnter time to count down");
        int n = sc.nextInt();

        System.out.println("Starting count down from " + n);
        int i = n;
        while (i >= 0) {
            System.out.println(i);
            --i;
            try{Thread.sleep(1000);}
            catch(InterruptedException e){
                System.out.println("Countdown interrupted!");
            }

        }
        System.out.println("Happy new year!!");
    }

}
