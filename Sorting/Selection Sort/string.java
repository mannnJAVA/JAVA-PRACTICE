import java.util.Scanner;

public class string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("String sorting selection sort");
        System.out.print("\nEnter String : ");
        String str=sc.nextLine();
        char arr[]=str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
                int min=i;
                for (int j = i+1; j < arr.length; j++) {
                    if(Character.toLowerCase(arr[min]) >Character.toLowerCase(arr[j])){
                        min=j;
                    }
                    
                }
                char temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            
        }
        String NewStr=new String(arr);
        System.out.println("Sorted string is : "+NewStr);
    }
}
