public class reverseStr {
    public static void reverse(String str,int index){
            if(index==0){
                        System.out.println(str.charAt(index));
                    return;
            }

        System.out.println(str.charAt(index));
        reverse(str, index-1);
    }
    public static void main(String[] args) {
        String s="abcd";
        reverse(s,s.length()-1);
    }
}
