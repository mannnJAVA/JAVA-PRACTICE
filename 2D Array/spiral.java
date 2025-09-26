import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Spriral bound matrix m x n \n Enter the size of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of colums : ");
        int col=sc.nextInt();

        int[][] arr=new int[rows][col];

        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j]=sc.nextInt();
                }   
                System.out.println();         
        }    


        int rowstart=0;
        int colstart=0;
        int rowend=rows-1;
        int colend=col-1;
        
        while(rowstart<=rowend && colstart<=colend){
            for (int cols =colstart; cols <=colend; cols++){

                System.out.print(arr[rowstart][cols]+" ");
                
            }
            rowstart++;

            for (int row = rowstart; row <= rowend; row++) {

                System.out.print(arr[row][colend]+" ");

                
            }
            colend--;

            for(int coli=colend;coli>=colstart;coli--){
                System.out.print(arr[rowend][coli]);
            }
            rowend--;
             for (int row = rowend; row >= rowstart; row--) {

                System.out.print(arr[row][colstart]+" ");

                
            }
            colstart++;
           // System.out.println();

        }

        
    }
}
