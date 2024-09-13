class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int counts[] = new int[n+1];
        for(int c: citations){
            if(c > n){
                counts[n]++;
            }
            else{
                counts[c]++;
            }
        }
        int count = 0;
        for(int i = n; i >= 0; i--){
            count += counts[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}