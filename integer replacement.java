public class Solution {
    public int integerReplacement(int n) {
        int result=0;
        while(n!=1){
            if((n&1)==0){
                n>>>=1;
            }
            else if(n==3 || Integer.bitCount(n+1)>Integer.bitCount(n-1)){
                n--;
            }
            else{
                n++;
            }
            result++;
        }
        return result;
    }
}
//if use n>>=1, time limitation exceeded
//if use n>>>=1. accepted
