class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        int length=0;

        while(high < n){

            sum += nums[high];

            while(sum >= target){
                length = high-low+1;
                res = Math.min(res, length);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}