package LinkedList;

import java.util.LinkedList;

public class itrates {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Game");
        list.add("of");
        list.add("Thrones");

        for(String n: list){
            System.out.print(n+" ");
        }
    }
}
