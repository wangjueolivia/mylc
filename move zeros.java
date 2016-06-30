public class Solution {
    public void moveZeroes(int[] nums) {
        int current=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[current++]=nums[i];
            }
        }
        for(;current<nums.length;current++){
            nums[current]=0;
        }
    }
}
