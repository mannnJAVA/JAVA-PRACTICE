import java.util.Scanner;

public class transpose {
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
        
        System.out.println("Matrix is : ");
        for (int i = 0; i < row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int [][] transpsedd=transpo(arr, row, col);
       System.out.print("Sum of rows and column is : "+ sum(arr,row,col)); 
        System.out.print("\n\nFind the indices of matrix \nChoose options :\na.Indices of orignal matrix\nb.Indices of Transposed matrix\n   ");
       char n=sc.next().charAt(0);
       switch (n){
        case 'a':        {System.out.print(" Enter the number to find indices : ");
       int target=sc.nextInt();
       search(arr, row, col, target);
       break; 

       }
       case 'b': {
               System.out.print(" Enter the number to find indices : ");
       int target=sc.nextInt();
       search(transpsedd, col, row, target);
       break;
       }
       default : System.out.println("Invalid option!");

       }


    }
    public static int[][] transpo(int[][] arr,int row,int col){

        int tran[][]=new int[col][row];
        
        for (int idx = 0; idx < row; idx++) 
        {
            for (int i = 0; i < col; i++) {
                tran[i][idx]=arr[idx][i];
            }
            
        }
        System.out.println("\n\n Transposed matrix is : ");
        for(int i=0;i<col;i++){
             for(int j=0;j<row;j++){
                System.out.print(tran[i][j]+" ");
            

        }
        System.out.println();

        }
        return tran;

    }
    public static int sum(int[][] arr,int row ,int col){
        int summ=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                    summ+=arr[i][j];
                
            }
            
        }
        return summ;
    }
    public static void search(int[][] arr,int row , int col,int target){
        boolean found=false;
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                if(arr[i][j]==target)
                {
                    System.out.print("Target "+target+" found at indices : i = "+i+", j = "+j);
                    found=true;
                }
            }
            if(!found){
                System.out.println("Target not found !");
            }
        }
       
    }
}
