
import java.util.*;

public class removeDups {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,5,2,3,4,4,6));
        ArrayList<Integer> newlist = new ArrayList<>();
    
        for(int num: list){
            if(!newlist.contains(num)){
                newlist.add(num);
            }
        }
        System.out.println("orignal list : "+list);
        System.out.println("Removed duplicates : "+newlist);

        Collections.sort(newlist);
        System.out.println("Sorted new List : "+newlist);

        int max= Collections.max(newlist);
        System.out.println("Maximum : "+max);

        int min = Collections.min(newlist);
        System.out.println("Minimum : "+min);
    }
}
