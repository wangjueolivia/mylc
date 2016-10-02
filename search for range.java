public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res ={-1,-1};
        int i=0,j=nums.length-1;
        //find left
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        if(nums[i]!=target){
            return res;
        }
        res[0]=i;
        //right
        j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2+1;  //+1 make bias to right, save time
            if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid;
            }
        }
        res[1]=j;
        return res;
    }
}
