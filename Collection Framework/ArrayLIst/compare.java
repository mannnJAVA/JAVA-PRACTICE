
import java.util.ArrayList;
import java.util.Arrays;

public class compare {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<>(Arrays.asList(3,3,3));
        ArrayList<Integer> num2=new ArrayList<>(Arrays.asList(3,3,3));
        Boolean t=num1.equals(num2);
        System.out.println(t);

    }
}
