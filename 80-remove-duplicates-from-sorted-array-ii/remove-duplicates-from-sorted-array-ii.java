class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        
        // If array size is <= 2, no need to remove anything
        if (n <= 2) {
            return n;
        }

        int slow = 2;

        for(int fast = 2; fast<nums.length; fast++){
            if(nums[fast] != nums[slow-2]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}