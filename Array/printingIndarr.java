import java.util.Scanner;
public class printingIndarr {
    public static void IndexOfElement(int N, int X, int[] arr){
        int ind=0;
        for(int i=1;i<=N-1;i++){

            if(arr[i]==X){
                i=arr[i];
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print(-1);
            }

        }
    }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int arr[]=new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        IndexOfElement(N,X,arr);
    }
    
}
