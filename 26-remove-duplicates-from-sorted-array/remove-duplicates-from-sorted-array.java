class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int slow = 0;
        int fast = 1;
        for(int i=fast; i<nums.length; i++){
            if(nums[slow] == nums[fast]){
                fast++;
            }else{
                slow++;
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                fast++;
            }
        }
        return slow + 1;
    }
}