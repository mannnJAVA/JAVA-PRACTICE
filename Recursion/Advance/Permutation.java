import java.util.Scanner;

public class Permutation {
    public static int count=0;
    public static long fact(int n) {
        long f=1;
        for (int i = 1; i <= n; i++) {
        f*=i;
        }
        
        return f;
    }
    public static void printPermutation(String str,String pmt){
        
        if(str.length()==0){
             count++;
            System.out.println(pmt);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, pmt+curr);
           
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print the permutation of the string & Total number of permutations \n\n");
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        int n=str.length();
        long total=fact(n);
        printPermutation(str,"");
        System.out.println("\n\nString is : "+str+"\n\nTotal no of permutations : "+total);
    }
}
