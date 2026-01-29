class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum = nums[0];
        int minSum = nums[0];

        int res = Math.abs(nums[0]);
        int maxRes = nums[0];
        int minRes = nums[0];

        for(int i=1; i<nums.length; i++){
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            maxRes = Math.max(maxRes, maxSum);

            minSum = Math.min(minSum + nums[i], nums[i]);
            minRes = Math.min(minRes, minSum);

            res = Math.max(Math.abs(minRes), maxRes);
        }
        return res;
    }
}