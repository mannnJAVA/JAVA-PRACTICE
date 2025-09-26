import  java.util.Scanner;
public class revchunktoo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Reverse array \nEnter the size of an array : ");
        int n=sc.nextInt();
        
        int arr[]=new int [n];
        n=arr.length;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

            
        }
        int last=n-1;
        int i=0;
while(i<last){
            int temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            i++;
            last--;

        }
        System.out.print("\n\nReveresed array is : ");
            for (int j = 0; j <n; j++) {
                System.out.print(arr[j]+" ");
            
        }

    }
}
