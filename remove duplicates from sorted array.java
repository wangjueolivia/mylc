public class Solution {
    public int removeDuplicates(int[] nums) {
      
        if(nums.length==0){
            return 0;
        }
        if(nums.length<2){
            return nums.length;
        }
        else{
            int i=0;
            for(int n:nums){
                if(i<1 || n>nums[i-1]){
                    nums[i++]=n;
                }
            }
            return i;
        }
        
    }
}
