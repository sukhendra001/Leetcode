class Solution {
    public boolean isPalindrome(int x) {
         if(x < 0){
            return false;
        }
        int temp = x;
        int revNum = 0;
        int digit;

        while(x != 0){

            digit = x % 10;
            revNum = revNum*10 + digit;
            x = x/10;
        }
        if(revNum == temp){
            return true;
        }else{
            return false;
        }
    }
}