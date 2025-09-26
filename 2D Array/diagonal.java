import java.util.Scanner;

public class diagonal {
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Find indices of number in 2d array\n Enter the number of rows : ");
        int row=sc.nextInt();

        System.out.print("Enter the number of columns : ");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        if(row==col){
        for (int i = 0; i < row;i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("\n\nMatrix : ");
        for (int i = 0; i < row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("Rows and colums must be equal for diagonal elements !");

    }
    int colstart=0;
    int colend=col-1;
    int rowstar=0;
    int rowend=row-1;
    System.out.println("\n\nAntiDiagonal elements are : ");
    int sum=0;
    while (rowstar<=rowend && colstart<=colend){
       
     
     
    for (int i =rowstar ; i <=rowend; i++){
        System.out.print(arr[i][colend]+" ");
              sum+=arr[i][colend];

        colend--;
         }   
         
    }
     System.out.print("\n\nSum of antidiagonal element is : "+sum);
    System.out.print("\n\nDiagonal elements are : ");
    int s=0; 
    for (int i = 0; i < row; i++) {
         System.out.print(arr[i][i]+" ");
         s+=arr[i][i];
     }
     System.out.print("\n\nSum of diagonal elements are : "+s);
  }
  
}