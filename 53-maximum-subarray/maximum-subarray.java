public class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;

        int curr = 0;

        for(int i=0; i<=nums.length-1; i++){
            curr+=nums[i];

            if(curr > maxSum){
                maxSum = curr;
            }

            if(curr < 0){
                curr = 0;
            }
        }

        return maxSum;
    }
}
