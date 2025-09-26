import java.util.Scanner;

public class duplicate {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("!!! Selection Sort !!!\nEnter the lenght of an array:");
        int n=sc.nextInt();
        System.out.print("Enter an array : ");
        int[] arr=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int small=i;

            for (int j = i+1; j < n; j++) {
                
                if( arr[small]>arr[j]){
                    small=j;
                }
                
            }
           
            int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            
        }
        System.out.print(arr[0]+" ");
       for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        
    }
}
