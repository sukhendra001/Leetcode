class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[] = merge(nums1, nums2);

        if (ans.length % 2 == 0) {
            double ans2 = (double) (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2;
            return ans2;
        } else {
            double ans2 = (double) (ans[ans.length / 2]);
            return ans2;
        }

    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length || j < arr2.length) {
            int val1 = i < arr1.length ? arr1[i] : Integer.MAX_VALUE;
            int val2 = j < arr2.length ? arr2[j] : Integer.MAX_VALUE;

            if (val1 < val2) {
                ans[k] = val1;
                i++;
            } else {
                ans[k] = val2;
                j++;
            }
            k++;

        }
        return ans;
    }
}