import java.util.Scanner;
/*Question 6: Rotate Array by k Steps
🧩 Prompt:
Given an array, rotate it to the right by k positions.
Example:
Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4] */

public class rotate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Roate array to right by k steps \n \nEnter the size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter an array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\n Enter the number of steps K :  ");
        int k=sc.nextInt();
        
       
            
        
        
        int last=n-1;
                int first=0;
       while (first<last) {
               
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            last--;
            first++;
       }
        int lst=k-1;
        int j=0;
     while(j<lst) {
        int temp=arr[j];
        arr[j]=arr[lst];
        arr[lst]=temp;
        lst--;
        j++;

         
     }
    
      int lt=n-1;
      int ft=k;

    while (ft<lt) { 
        
        int temp=arr[ft];
        arr[ft]=arr[lt];
        arr[lt]=temp;
        ft++;
        lt--;
     }
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i]+" ");
     }
        
    
       }           


    }
