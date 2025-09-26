import java.util.Scanner;

public class diagonalsort {
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
     
    
    
    }
        
    }
public static void SortedArray(int[][] arr, int i, int j, int row, int col) {
int x = i, y = j, size = 0;
        while (x < row && y < col) {
            size++;
            x++;
            y++;
        }

        // Step 2: Copy diagonal into temp
        int[] temp = new int[size];
        x = i; y = j;
        for (int k = 0; k < size; k++) {
            temp[k] = arr[x][y];
            x++; y++;
        }

        // Step 3: Selection sort
        for (int a = 0; a < size - 1; a++) {
            int min = a;
            for (int b = a + 1; b < size; b++) {
                if (temp[b] < temp[min]) {
                    min = b;
                }
            }
            int t = temp[a];
            temp[a] = temp[min];
            temp[min] = t;
        }

        // Step 4: Put back sorted values
        x = i; y = j;
        for (int k = 0; k < size; k++) {
            arr[x][y] = temp[k];
            x++; y++;
        }
    }


