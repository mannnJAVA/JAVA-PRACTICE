
import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {
         ArrayList<String> str=new ArrayList<>();
    str.add("Alice");
    str.add("in");
    str.add("The");
    str.add("ls");
    str.add("Border");
    str.add("Land");
    System.out.println(str);
    str.remove(3);
    System.out.println(str);

     Boolean a= str.contains("Alice");
     System.out.println(a);
    }
   

}
