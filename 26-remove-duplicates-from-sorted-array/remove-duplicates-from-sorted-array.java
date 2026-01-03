class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int slow = 0;
        int fast = 1;
        int unique = 1;
        int n = nums.length;
        while(fast < n){
            if(nums[slow] == nums[fast]){
                fast++;
            }else{
                nums[slow+1] = nums[fast];
                unique++;
                slow++;
                fast++;
            }
        }
        return unique;
    }
    
}