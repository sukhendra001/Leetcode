class Solution {
    public int pivotIndex(int[] nums) {
        
        int left = 0;
        int sum = 0;

        // total sum
        for(int n : nums){
            sum += n;
        }

        for(int i = 0; i < nums.length; i++){
            
            int right = sum - nums[i] - left;

            if(left == right){
                return i;
            }

            left += nums[i];  // update after check
        }

        return -1;
    }
}