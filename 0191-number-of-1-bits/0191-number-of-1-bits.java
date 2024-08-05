class Solution {
    public int hammingWeight(int n) {
        int total = 0;
        while(n != 0){
            if((n & 1) == 1)
                total++;
            n >>= 1;
        }
        return total;
    }
}