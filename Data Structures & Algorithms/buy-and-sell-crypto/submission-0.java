class Solution {
    // 10,1,5,6,7,1
    // 10 
    // 1
    // 5
    // 6
    // 7
    // 1
    // cache.put(10,)
    public int maxProfit(int[] prices) {
        
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i : prices) {
            maximumProfit = Math.max(maximumProfit, i - minimumPrice);
            minimumPrice = Math.min(minimumPrice, i);
        }

        return maximumProfit;
    }
}
