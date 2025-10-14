
import java.util.ArrayList;

public class iterate {
    public static void main(String[] args) {
        ArrayList<Integer> lst= new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(5);

        for (int idx = 0; idx < lst.size(); idx++) {
            System.out.println(lst.get(idx));
            
        }
System.out.println();
        for(int n : lst){
            System.out.println(n);
        }
    }
}
