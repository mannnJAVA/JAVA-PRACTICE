//Place Tiles of size 1xm in a floor of size nxm
public class tiles {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vetical=placeTiles( n-m, m);
        int horizontal=placeTiles(n-1, m);
        return vetical+horizontal;
    }
    public static void main(String[] args) {
        int n=4; int m=2;
        int placements=placeTiles(n, m);
        System.out.println(placements);
        
    }
}
