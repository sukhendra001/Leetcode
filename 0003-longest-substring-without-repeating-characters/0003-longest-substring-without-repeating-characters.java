class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int low = 0;
        int maxlen=0;

        HashMap<Character, Integer> freq = new HashMap<>();

        for(int high=0; high<n; high++){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while(freq.get(c) > 1){
                char l = s.charAt(low);
                freq.put(l, freq.get(l)-1);
                low++;
            }
            maxlen = Math.max(maxlen, high-low+1);
        }
        return maxlen;
    }
}