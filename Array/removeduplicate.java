import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.print("remove duplicates from array \n Enter the size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();

        }
        System.out.println("\n\nDuplicate removed : ");
        for (int i = 0; i < n; i++) {
                boolean dp=false;
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    dp=true;
                    

                }
                
                
            }
            if(!dp){
                System.out.print(arr[i]+" ");}
        }
    }
}
