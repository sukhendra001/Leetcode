public class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map for characters in t
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();     // total chars needed
        int minLen = Integer.MAX_VALUE;
        int start = 0;                 // start index of result

        while (right < s.length()) {

            char r = s.charAt(right);

            // If char is needed, reduce required
            if (freq[r] > 0) {
                required--;
            }

            freq[r]--;
            right++;

            // When window is valid
            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                freq[l]++;

                // If removing breaks validity
                if (freq[l] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
