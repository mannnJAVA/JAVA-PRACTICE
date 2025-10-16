package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class add {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("vaibhav");
        list.add("Mangesh");
        list.add("Abhishek");
        System.out.println(list);

        list.add(0, "Yash");
        System.out.println(list);

        list.addFirst("Om");
        System.out.println(list);

        list.addLast("Prathamesh");
        System.out.println(list);

        list.remove();  //removes first occurrence
        System.out.println(list); 

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    

       // list.get(2);
        //System.out.println(list);
    }
}
