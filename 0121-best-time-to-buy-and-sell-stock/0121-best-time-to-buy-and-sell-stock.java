class Solution {
    public int maxProfit(int[] prices) {
        int min = 0, max = 0, diff = 0;
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < prices[min])
                min = i;
            if(prices[i] > prices[max])
                max = i;
            if(min > max)
                max = min;
            if(min < max && prices[max] - prices[min] > diff)
                diff = prices[max] - prices[min];
            
        }
        return diff;
    }
}