package LinkedList;
//How to check if an element is present?

import java.util.LinkedList;
import java.util.Scanner;

public class exsist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list.add("HTML");
        list.add("CSS");
        list.add("JS");
        list.add("React");
        list.add("Node.js");
        System.out.println(list);

        System.out.print("Enter the element to search : ");

        String srch = sc.nextLine();

        if(list.contains(srch)){
            System.out.println(srch+ " found in the list");

        } else {
            System.out.println(srch+ " Not found !");

        }
        
        
    }
}
