import java.util.Scanner;

public class rows {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("2d arrays sorting in rows with selection sort\n\nEnter the number rows : ");
        int row=sc.nextInt();
        System.out.print("Enter the number of col : ");
        int col=sc.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("\n\nMatrix is : ");
        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("\n\nSorted row matrix : ");
           for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                int small=j;

                for(int k=j+1;k<col;k++){
                    if(arr[i][small]>arr[i][k]){
                        small=k;
                    }
                }
                if(small!=j){
                int temp=arr[i][j];
                arr[i][j]=arr[i][small];
                arr[i][small]=temp;
                }
            }

        }
                for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
