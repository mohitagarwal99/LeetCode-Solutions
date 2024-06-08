class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int dup = x;
        int pall = 0;
        while(x != 0){
            int temp = x % 10;
            pall = pall * 10 + temp;
            x /= 10;
        }
        if(dup == pall)
            return true;
        
        return false;
    }
}