
import java.util.Scanner;


//Count total paths in a maze to move from (0,0) to (n,m)
public class matrixPaths {

    public static int Paths(int n,int m,int i,int j){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
      int downPaths=  Paths(n, m, i+1, j);
      int rightPaths=  Paths(n, m, i, j+1);
        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Count total paths in a maze to move from (0,0) to (n,m)\n\n");
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.print("Enter the value of m : ");
        int m=sc.nextInt();
        int totalPaths=Paths(n, m, 0, 0);

        System.out.print("\n\nTotal paths are : "+totalPaths);
    }
}
