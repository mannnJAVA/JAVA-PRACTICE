package LinkedList;
//How to find the middle element?
import java.util.LinkedList;

public class middle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 7; i++) {

            list.add(i);
            
        }
        System.out.println(list);

        int middle = list.size()/2;
        System.out.println("middle element is : "+ list.get(middle));
    }
}
