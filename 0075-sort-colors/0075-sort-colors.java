class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0, count1 = 0, count2 = 0;

        // 1st pass: count
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // 2nd pass: overwrite array
        int index = 0;

        // put all 0s
        for (int i = 0; i < count0; i++) {
            nums[index] = 0;
            index++;
        }

        // put all 1s
        for (int i = 0; i < count1; i++) {
            nums[index] = 1;
            index++;
        }

        // put all 2s
        for (int i = 0; i < count2; i++) {
            nums[index] = 2;
            index++;
        }

    }
}
