

public class removeDups {
    public static boolean[] map=new boolean[25];
    public static void remove(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char current=str.charAt(idx);
        if(map[current-'a']){
            remove(str, idx+1, newStr);

        }
        else{
            newStr+=current;
            map[current-'a']=true;

            remove(str, idx+1, newStr);
        }
        
    }
    public static void main(String[] args) {
        String str="aabbccda";
        String newStr="";
        int idx=0;
        remove(str, idx, newStr);
    }
}
