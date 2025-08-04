public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Case 1: target found
            if (nums[mid] == target) {
                return mid;
            }

            // Case 2: Left part is sorted
            if (nums[left] <= nums[mid]) {
                // Check if target lies within the left sorted part
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Case 3: Right part is sorted
            else {
                // Check if target lies within the right sorted part
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // target not found
    }
}
