public class Solution {
    public int getSum(int a, int b) {
       if(a==0){
           return b;
       }
       int carry,sum;
       carry=(a&b)<<1;
       sum=a^b;
       return getSum(carry,sum);
       
    }
}
