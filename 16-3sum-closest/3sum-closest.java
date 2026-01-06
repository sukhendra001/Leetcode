class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int maxDiff = Integer.MAX_VALUE;
        int resSum = 0;

        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if(diff < maxDiff){
                    maxDiff = diff;
                    resSum = sum;
                }
                if(sum == target){
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return resSum;
    }
}