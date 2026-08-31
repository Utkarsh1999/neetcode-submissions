class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minValIdx = 0;

        for(int i=1; i<prices.length; i++) {
            if(prices[i] < prices[minValIdx]) {
                minValIdx = i;
            } else if(prices[i] - prices[minValIdx] > profit) {
                profit = prices[i] - prices[minValIdx];
            }
        }
        
        return profit;
    }
}

/*
    prices = [10,1,5,6,7,1]

*/
