class Solution {

    public boolean circularArrayLoop(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) continue;

            int slow = i;
            int fast = i;

            boolean forward = nums[i] > 0;

            while (true) {

                slow = next(nums, slow, forward);
                if (slow == -1) break;

                fast = next(nums, fast, forward);
                if (fast == -1) break;

                fast = next(nums, fast, forward);
                if (fast == -1) break;

                if (slow == fast) {
                    return true;
                }
            }

            // Mark path as visited
            int j = i;
            int dir = nums[i];

            while (nums[j] * dir > 0) {
                int next = getNext(nums, j);
                nums[j] = 0;
                j = next;
            }
        }

        return false;
    }

    private int next(int[] nums, int i, boolean forward) {

        if ((nums[i] > 0) != forward) {
            return -1;
        }

        int next = getNext(nums, i);

        if (next == i) {
            return -1;
        }

        return next;
    }

    private int getNext(int[] nums, int i) {

        int n = nums.length;

        int next = (i + nums[i]) % n;

        if (next < 0) next += n;

        return next;
    }
}
