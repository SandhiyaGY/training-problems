//LEETCODE:53
//Approach:Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int LEN=nums.length;
        int larSum=nums[0];
        int curSum=0;
        for(int i=0;i<LEN;i++){
            curSum+=nums[i];
            larSum=(curSum>larSum)?curSum:larSum;
            if(curSum<0){
                curSum=0;
            }
        }
        return larSum;
    }
}
