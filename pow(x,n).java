public class Solution {
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1.0;
        }
        if(n==Integer.MIN_VALUE){
            n=n/2;
            x*=x;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        return (n%2==0) ? myPow(x*x,n/2) : x*myPow(x*x,n/2);
    }
}
