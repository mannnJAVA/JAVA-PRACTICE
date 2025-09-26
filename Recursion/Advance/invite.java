//Find the number of ways in which you can invite n people to your party , single or in pairs

public class invite {
    public static int waysToinvite(int n){
        if(n<=1){
            return 1;
        }
        // single invitation
        int way1=waysToinvite(n-1);
        //pair invitation
        int way2=(n-1)*waysToinvite(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(waysToinvite(n));
    }
}
