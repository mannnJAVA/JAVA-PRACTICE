import java.util.Scanner;
public class insetionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insertion Sort");
        System.out.print("\n\nEnter the length of an arrya : ");
        int n=sc.nextInt();
        System.out.print("Enter an array : ");
        int[] arr=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
                arr[idx]=sc.nextInt();            
        }
        for (int i = 0; i < n; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            
        }
        System.out.println("\nSorted Array : ");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
