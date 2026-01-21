class Solution {

    public static int sum(int d){
            int sum = 0;
            while(d > 0){
                int digit = d % 10;
                d = d/10;
                sum += digit * digit;
            }
            return sum;
        }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while(fast != 1){
            slow = sum(slow);
            fast = sum(sum(fast));

            if(slow == fast && fast != 1){
                return false;
            }
        }
        return true;
    }
}