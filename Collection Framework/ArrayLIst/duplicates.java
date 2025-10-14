
import java.util.ArrayList;
import java.util.Arrays;

public class duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>(Arrays.asList(1,3,3,5,2,5));
        System.out.println("original : "+num);

        System.out.println("duplicates : ");
        for (int i = 0; i < num.size(); i++) {
            for (int j = i+1; j < num.size(); j++) {
                if(num.get(i)==num.get(j)){
                    System.out.println(num.get(i));
                }
                
            }
            
        }
    }
}
