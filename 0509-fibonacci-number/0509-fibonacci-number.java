class Solution {
    HashMap<Integer, Integer> hash = new HashMap<>();
    
    public int fib(int n) {

       

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        if(hash.containsKey(n)) return hash.get(n);

        int ans = fib(n-1) + fib(n-2);

        hash.put(n, ans);

        return ans;
    }
}