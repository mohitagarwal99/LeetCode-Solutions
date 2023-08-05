class Solution {
    public int mySqrt(int x) {
        if(x < 2)
            return x;
        for(int i = 1; i <= x/2+1; i++)
        {
            
            if(x/i == i)
                return i;
            else if(x/i < i)
                return i-1;
        }
        return 0;
    }
}