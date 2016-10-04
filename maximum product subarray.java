public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int result=nums[0],maxPre=nums[0],minPre=nums[0],max,min;
        for(int i=1;i<nums.length;i++){
            max=Math.max(Math.max(maxPre*nums[i],minPre*nums[i]),nums[i]);
            min=Math.min(Math.min(maxPre*nums[i],minPre*nums[i]),nums[i]);
            result=Math.max(max,result);
            maxPre=max;
            minPre=min;
        }
       return result; 
    }
}
