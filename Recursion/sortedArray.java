

public class sortedArray {
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
    
        if(arr[i]>=arr[i+1]){
        return false;
       }
       else{
        return isSorted(arr, i+1);
       }

      /*  if(arr[i]<=arr[i+1]){
            return isSorted(arr, i+1);
        }
        else{
            return false;
        } */

       
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        if(isSorted(arr, 0)==true){
            System.out.println("Array is sorted");

        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
