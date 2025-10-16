package LinkedList;

import java.util.LinkedList;

public class removeDups {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();

        for( int num : list){
            if(!list2.contains(num)){
                list2.add(num);
            }
        }
        System.out.println("original : "+ list);
        System.out.println("Dups Removed : "+list2);
    }
}
