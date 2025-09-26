public class hanoi {
public static void towerOfhanoi(int n,String src,String helper,String desti)    {
   if(n==1){
        System.out.println("Transfer disk "+n+" from "+src+" to "+desti);
        return;
   }
        towerOfhanoi(n-1, src, desti,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+desti);
        towerOfhanoi(n-1, helper, src, desti);
    }
    public static void main(String[] args) {
        int n=2;
        towerOfhanoi(n, "src", "helper", "desti");
    }
}
