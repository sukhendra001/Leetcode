class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        // 1. Old size + 1 ka new array
        int[][] arr = new int[intervals.length + 1][2];

        boolean insert = false;
        int k = 0;

        // 2. New interval ko sorted position par insert karo
        for (int i = 0; i < intervals.length; i++) {

            // Existing interval ka start check karo
            if (!insert && intervals[i][0] >= newInterval[0]) {
                arr[k++] = newInterval;
                insert = true;
            }

            // Existing interval add karo
            arr[k++] = intervals[i];
        }

        // 3. Agar newInterval abhi tak insert nahi hua
        if (!insert) {
            arr[k++] = newInterval;
        }

        // 4. Ab Merge Intervals logic
        List<int[]> result = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i][0] <= end) {
                // Overlap
                end = Math.max(end, arr[i][1]);
            } else {
                // No overlap
                result.add(new int[]{start, end});

                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Last interval
        result.add(new int[]{start, end});

        // List<int[]> → int[][]
        return result.toArray(new int[result.size()][]);
    }
}