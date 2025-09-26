import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.print("Check the frequency of number in array \n Enter the size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();

        }
        System.out.print("Enter the number to check frequency : ");
        int frequency=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==frequency){
                count++;
            }
        }
        System.out.print("Frequency of "+frequency+" is : "+count+"\n\n");
        for (int i = 0; i < n; i++) {
                            boolean alc=false;

            for (int j = 0; j <i; j++) {
                  if(arr[i]==arr[j]){
                    alc=true;
                    break;
                }
            }
                    int c=1;

            if(alc) continue;
                for (int k = i+1; k < n; k++) {
                     if(arr[i]==arr[k]){
                    c++;
                }
            
         }
         System.out.println(arr[i]+" = "+c+" Times");
         }

        }
      
       

    }

