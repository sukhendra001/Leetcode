class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;

        int ptr = ans.length - 1;

        while (start <= end) {
            int ss = nums[start] * nums[start];
            int ed = nums[end] * nums[end];

            if (ss > ed) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = ed;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}