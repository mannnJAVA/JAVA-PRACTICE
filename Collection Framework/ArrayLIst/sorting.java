import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>(Arrays.asList(3,5,1,6,2,7,4));

        Collections.sort(num);// sorting array using Collection class that provides static methods 
        
        System.out.println(num);

        Collections.reverse(num);


        System.out.println(num);

        int s=num.size();
        System.out.printf("Size of array is %d \n",s);

        num.clear();
        System.out.println(num);

    }
}
