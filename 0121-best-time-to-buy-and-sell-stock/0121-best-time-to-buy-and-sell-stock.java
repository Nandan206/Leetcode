class Solution {
    public int maxProfit(int[] prices) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = Integer.MIN_VALUE;
            for(int i=0;i<prices.length;i++){
                minprice = Math.min(minprice, prices[i]);
                maxprofit = Math.max(maxprofit, prices[i]-minprice);
            }
        return maxprofit;
    }    
}