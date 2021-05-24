class Solution {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxSum = 0;
        
        for(int i = 0; i < prices.length; i ++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            
            maxSum = Math.max(prices[i] - minPrice, maxSum);
        }
        
        return maxSum;
    }
}