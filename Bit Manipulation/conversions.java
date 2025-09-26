import java.util.Scanner;

public class conversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Deci");
        int d=sc.nextInt();
        decimalToBinary(d);
        System.out.print("Conversions of number from decimal to binary and binary to decimal");
        int choice;

       do { 
            System.out.println("1.Decimal To Binary conversion.");
            System.out.println("2.Binary To Decimal conversion.");
            System.out.println("3.Exit");
            choice=sc.nextInt();

          switch (choice) {
                case 1: 
                        System.out.println("Decimal To Binary conversion.");
                        System.out.print("Enter Decimal number : ");
                        int dec=sc.nextInt();
                        decimalToBinary(dec);
                        break;
                case 2: 
                        System.out.println("Binary To Decimal conversion.");
                         System.out.print("Enter Binary number : ");
                        int bin=sc.nextInt();
                        BinaryToDecimal(bin);
                        break;
                default:
                    throw new AssertionError();
            }


            
            
        } while (choice!=3);
    }
    public static void decimalToBinary(int decimal){
        int temp=decimal;
        int binary=0;
        do{
            int k=temp%2;
             binary = binary *10+k;
             temp=temp/2;
        }while(temp!=0);
        System.out.println("Binary : "+reverse(binary));
    }
    public static int reverse(int b) {
        int temp=b;
        int rev=0;
        do { 
            int k=temp%10;
            rev=rev*10+k;
            temp/=10;
        } while (temp!=0);
        return rev;
        
    }
    public static void BinaryToDecimal(int binary){
        
    }
}
