public class quicksort{
 public static int pivot(int arr[],int low,int high) {
     int pvt=arr[high];
     int i=low-1;

     for (int j = low; j < high; j++) {
        if(arr[j]<=pvt){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
         
     }
    
     int temp=arr[i+1];
     arr[i+1]=arr[high];
     arr[high]=temp;
     return i+1;
     
 }

public static void Quick(int arr[],int low,int high){
    if(low<high){

        int pi=pivot(arr,low,high);
        Quick(arr, low, pi-1);
        Quick(arr, pi+1, high);
    }
}
    public static void main(String[] args){
        int arr[]= {5,6,3,7,1,8};
        int n=arr.length;
        Quick(arr, 0, n-1);

        for(int a:arr) System.out.print(a+" ");
    }
}