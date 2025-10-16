package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class reverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.reverse(list);// using collection class
        System.out.println(list);

        LinkedList<Integer> reversed = new LinkedList<>();

        for (int i = list.size()-1; i >=0; i--) {

            reversed.add(list.get(i));
        }
        System.out.println(reversed);
    }  
}
