public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize with the first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to start a new subarray at i or continue previous one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
