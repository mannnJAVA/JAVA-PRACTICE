
import java.util.Scanner;

public class indi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Find indices of number in 2d array\n Enter the number of rows : ");
        int row=sc.nextInt();

        System.out.print("Enter the number of columns : ");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        for (int i = 0; i < row;i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
            
        }
        for (int i = 0; i < row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the target : ");
        int target=sc.nextInt();
          for (int i = 0; i < row;i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==target){
                    System.out.println("Indices are : "+i+", "+j);
                }
            }
        }

    }
}