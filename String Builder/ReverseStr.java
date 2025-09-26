
public class ReverseStr{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("hello");
      for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int last=sb.length()-1-i;

        char atFront=sb.charAt(i);
        char atLast=sb.charAt(last);

       sb.setCharAt(front, atLast);
       sb.setCharAt(last, atFront);
        
      }
    
      System.out.println(sb);
    }
}