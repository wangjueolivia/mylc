public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res= new int[2];
        if(numbers==null ||numbers.length<2){
            return res;
        }
        int lo=0,hi=numbers.length-1;
        while(lo<hi){
            int sum=numbers[lo]+numbers[hi];
            if(sum==target){
                res[0]=lo+1;
                res[1]=hi+1;
                //return res;
                break;
            }
            else if(sum<target){
                lo++;
            }
            else{
                hi--;
            }
        }
         return res;
    }
}
