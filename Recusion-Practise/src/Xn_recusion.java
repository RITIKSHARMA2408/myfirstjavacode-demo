public class Xn_recusion{
    public static int calculatePower(int x,int n){
        if(n==0){ //base case 1
            return 0;
        }
        if(n==1){
            return x;
        }
        int xpowernm1 = calculatePower(x,n-1);
        int xpown = x * xpowernm1;
        return xpown;
    }
    public static void main(String[] args){
        int x = 2, n=5;
        int ans = calculatePower(x,n);
        System.out.println(ans);
    }
}
