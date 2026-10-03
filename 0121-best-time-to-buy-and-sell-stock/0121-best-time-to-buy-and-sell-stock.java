class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprice = 0;
        for(int i =0;i<prices.length;i++){
            int profit = prices[i] - minprice;
            maxprice = Math.max(maxprice,profit);
            minprice = Math.min(minprice,prices[i]);
        }
        return maxprice;
    }
}