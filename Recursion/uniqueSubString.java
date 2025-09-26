
import java.util.HashSet;

public class uniqueSubString {
    public static void UniqueSub(String str,int idx,String newStr, HashSet<String>set) {
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char current=str.charAt(idx);
        //to be
        UniqueSub(str, idx+1, newStr+current, set);

        //not to be
        UniqueSub(str, idx+1, newStr, set);
    }
    public static void main(String[] args){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        UniqueSub(str, 0, "", set);
    }
}
