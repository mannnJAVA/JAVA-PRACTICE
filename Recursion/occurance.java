public class occurance {
    public static int first=-1;
    public static int last=-1;
    public static void occu(String str,int idx,char element) {
        if(idx==str.length()){
            System.out.println("first occurance of "+element+" is : " +first);
            System.out.println("last occurance of "+element+" is : " +last);
            return;
        }

        char current =str.charAt(idx);
        if(current==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
        }
        }
        occu(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str="aabaacaadaef";
        char el='a';
        occu(str, 0, el);
    }
}
