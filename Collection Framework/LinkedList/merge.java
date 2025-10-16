package LinkedList;

import java.util.LinkedList;

public class merge {
public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
        
        list.add("Game");
        list.add("of");
        list.add("Thrones");
        System.out.println(list);

      LinkedList<String> list2 = new LinkedList<>();
      list2.add("Season");
      list2.add("one");
      System.out.println(list2);

      list.addAll(list2);
      System.out.println(list);
}  
}
