

public class moveEl {
    public static void moveElemenets(String str,int i,int count,String newStr,char element){
        if(i==str.length()-1){
            for (int id = 0; id <count; id++) {
                newStr+=element;

            }
            System.out.println(newStr);
            return;
        }

        char current=str.charAt(i);
        if(current==element){
            count++;
            moveElemenets(str, i+1, count, newStr, element);
        }
        else{
            newStr+=current;
            moveElemenets(str, i+1, count, newStr, element);

        }
    }
    public static void main(String[] args) {
        String str="mxxlxtxoxoo";
        char element='x';
        int count=0;
        String newString="";
        moveElemenets(str,0, count, newString, element);
    }
}
