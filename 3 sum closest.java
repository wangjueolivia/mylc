public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3){
            return target;
        }
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int lo=i+1,hi=nums.length-1;
        while(lo<hi){
            int sum=nums[i]+nums[lo]+nums[hi];
            if(sum>target){
                hi--;
            }
            else{
                lo++;
            }
            if(Math.abs(sum-target)<Math.abs(result-target)){
                result=sum;
            }
        }
        }
        return result;
    }
}
