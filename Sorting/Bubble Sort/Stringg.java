
import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String name=sc.nextLine();

        char arr[]=name.toCharArray();
         

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
               
            }   
               
        }
            System.out.print("Sorted String : ");

      /*  for(char a:arr){
            System.out.print(a+" ");

        } */
       //System.out.println(new String(arr));
      // String New=arr.toString(); this is not right way
       //System.out.println(New);
       String New= new String(arr);
       System.out.println(New);

    }
}
