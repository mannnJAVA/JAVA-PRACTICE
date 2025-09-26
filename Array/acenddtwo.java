import java.util.Scanner;

public class acenddtwo {
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
        System.out.print("Check the numbers are in acending order or not\n Enter the size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();

        }
                    boolean isAcensding=true;
       for (int i = 0; i < n-1; i++) {
           
       
            
            if(arr[i]>arr[i+1]){
                isAcensding=false;
        }
        }
        if(isAcensding){
            System.out.println("Array is  in asending order ");

        }
        else{
            System.out.println("Array is not in acending order");
        }
    }
    
}
