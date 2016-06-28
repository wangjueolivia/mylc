public class Solution {
    public int addDigits(int num) {
        int rst=0;
       
       while(num>9){
           rst+=num%10;
           num/=10;
       }
       if(num<=9){
           rst+=num;
       }
       
       while(rst>9){
           rst=rst/10+rst%10;
       }
       return rst;
    }
}
//first make sure num<9 then add to rst
