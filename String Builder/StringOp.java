import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);

        int choice=0;
        
        do { 
        System.out.print("Operations to perform on String :\n1.Get Charectar From Index.\n2.Set charecter at Index.\n3.Insert Charecter at Index.\n4.Delete charecter at some Index.\n5.Append Charecter.\n6.Print lengths of the String.\n7.Exit.\nChoose Option : ");
        choice=sc.nextInt();
        System.out.println();
            switch (choice) {
                case 1 : System.out.print("Enter the Index : ");
                            int n=sc.nextInt();
                            GetChar(sb,n);
                                        System.out.println();

                    
                    break;
                case 2 : System.out.print("Enter the Index : ");
                            int i=sc.nextInt();
                         System.out.print("Etner the Charecter : ");
                            char c=sc.next().charAt(0);
                            SetChar(sb,c,i);
                                        System.out.println();

                            break;
                case 3 : System.out.print("Enter the index : ");
                            int m=sc.nextInt();
                         System.out.print("Enter the Charecter to insert : ");
                            char cha=sc.next().charAt(0);
                            InsertChar(sb,m,cha);
                                        System.out.println();

                            break;
                case 4 : System.out.print("Enter index of charecter to delete : ");
                            int h=sc.nextInt();
                            DeleteChar(sb, h);
                                        System.out.println();

                            break;
                case 5 : System.out.print("Enter Chareter to append : ");
                            char ct=sc.next().charAt(0);
                            AppendChar(sb, ct);
                                        System.out.println();

                            break;
                case 6 : System.out.print("The length of the string "+sb+" is : "+Length(sb));
                                        System.out.println();
            
                                        break;
                case 7 : System.out.println("Exiting...!");
                            break;
                default: System.out.println("Invalid Option !");
            }
            System.out.println();
            
        } while (choice!=7);
   
    }
    public static void GetChar(StringBuilder s, int index) {
            if(index>=0 && index <s.length()){
                System.out.println("Charecter at Index "+index+" is : "+s.charAt(index));
            }
            
        
    }
    public static void SetChar(StringBuilder s,char ch,int index) {
        if(index>=0 && index<=s.length()){
            
            s.setCharAt(index, ch);
            System.out.println("New String : "+s);


        }
        else{
                System.out.println("Invalid Index !");
            }
        
    }
    public static void InsertChar(StringBuilder s,int index,char ch) {
           if(index>=0 && index<=s.length()){
            
            s.insert(index,ch );
            System.out.println("New String : "+s);


        }
        else{
                System.out.println("Invalid Index !");
            }
        
    }
    
    public static void DeleteChar(StringBuilder s,int index) {
           if(index>=0 && index<=s.length()){
            
            s.deleteCharAt(index);
            System.out.println("New String : "+s);


        }
        else{
                System.out.println("Invalid Index !");
            }
        
    }  
      public static void AppendChar(StringBuilder s,char ch) {
           
            s.append(ch);
            System.out.println("New String : "+s);

    }
          public static int Length(StringBuilder s) {
           
                    return s.length();
    }
}
