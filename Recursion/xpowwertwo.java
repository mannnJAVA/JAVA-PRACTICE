public class xpowwertwo {
    public static void main(String[] args){
        int x=2;
        int n=5;
        int ans=Xpower(x, n);
        System.out.println(ans);
    }
    public static int Xpower(int x,int n){
        if(x==0)return 0;
        if(n==0)return 1;
        if(n%2==0){
            return Xpower(x,n/2) * Xpower(x, n/2);
        }
        else{
           return Xpower(x, n/2)*Xpower(x, n/2)*x;
        }

        
        
    }
}
