

public class printN{
    public static void printn(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printn(n+1);

       
    }
    public static void main(String[] args) {
       int m=1;
       printn(m);
    }
}