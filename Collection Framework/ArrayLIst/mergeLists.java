
import java.util.*;

public class mergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>(Arrays.asList(1,2,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,5,6));

        list1.addAll(list2);
        System.out.println(list1);
        
        Collections.sort(list1);
        System.out.println(list1);

    


    }
}
