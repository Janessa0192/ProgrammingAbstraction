class Solution {
    public int maxProfit(int[] prices) {
        
        int min_num = prices[0];
        int profit = 0;
        int max_profit = 0;

        for(int i=1;i<prices.length;i++){

            profit = prices[i]-min_num;
            if(profit<0) profit=0;

            min_num = Math.min(min_num,prices[i]);
            max_profit = Math.max(profit,max_profit);
        }

        return max_profit;
    }
}