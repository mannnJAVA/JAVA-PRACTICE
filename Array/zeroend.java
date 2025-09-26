import java.util.Scanner;
public class zeroend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Zeros to end \n\nEnter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an array : ");
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx]=sc.nextInt();
            
        }
        System.out.println(zeroto(arr));

    }
    public static int[] zeroto(int[] arr){

       int count=0;
       
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[i]=arr[count];
                count++;

            }
        }
            while(count<arr.length){
                arr[count]=0;
                count++;

            }
       return arr;


    }
}
