package LinkedList;

import java.util.LinkedList;
//How to make a copy of a LinkedList?
public class cloneLInkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(222);
        list.add(343);
        list.add(534);

        LinkedList<Integer> list2= (LinkedList<Integer>) list.clone();
        //.clone() gives a shallow copy (elements themselves are not cloned, only references).

        System.out.println("Original : "+ list);
        System.out.println("Clone : "+ list2);

        
    }
}
