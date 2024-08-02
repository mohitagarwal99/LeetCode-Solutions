class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n == 1){
            return 1;
        }
        int candies[] = new int[n];
        Arrays.fill(candies, 1);
        solution(candies, ratings, n);
        int tot = 0;
        for(int a: candies){
            tot += a;
        }
        return tot;
    }
    
    public void solution(int[] candies, int ratings[], int n){
        boolean flag = true;
        while(flag)
        {
            flag = false;
            for(int i = 0; i < n; i++){
            if(i > 0 && ratings[i] > ratings [i-1] && candies[i] <= candies[i-1])
            {
                flag = true;
                candies[i] = candies[i-1] + 1;
            }
            if(i < n-1 && ratings[i] > ratings [i+1] && candies[i] <= candies[i+1])
            {
                flag = true;
                candies[i] = candies[i+1] + 1;
            }
        }}
    }
}