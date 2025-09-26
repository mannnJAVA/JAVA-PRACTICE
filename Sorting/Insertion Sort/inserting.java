import java.util.Scanner;

public class inserting {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Inserting elements in sorted array using insertion sort \n\n");
    System.out.print("Enter the length of an array : ");
    int n=sc.nextInt();
    System.out.print("Enter an sorted array : ");
    int[] arr=new int[n+1];//increasing length by one index to make space for inserted element
    for (int idx = 0; idx < n; idx++) {
        arr[idx]=sc.nextInt();        
    }
    System.out.print("\nEnter an Element to insert : ");
    int key=sc.nextInt();
    int j=n-1;
    while(j>=0 && key < arr[j]){
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=key;
    System.out.println("\nNew array after insertion : ");
    for(int num:arr){
        System.out.print(num+" ");
    }
    }


    

}
