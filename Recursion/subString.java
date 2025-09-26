public class subString {
    public static void SubString(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        //to be
        SubString(str, idx+1,newStr+currChar);
        //not to be
        SubString(str, idx+1, newStr);
        
    }
    public static void main(String[] args) {
        String str="abc";
        SubString(str, 0, "");
    }
}
