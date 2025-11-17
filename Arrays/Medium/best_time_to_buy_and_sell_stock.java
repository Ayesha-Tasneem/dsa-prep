//problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//time complexity: O(n)
//space complexity: O(1)
//Greedy Approach
class Solution {
    public int maxProfit(int[] prices) {
        //start with the first price
        int min = prices[0];
        int profit = 0;
        for(int price : prices){
            //compare prices
            if(price < min) min = price;
            //profit after spending to buy the stock
            profit = Math.max(profit, price-min);
        }
        return profit;
    }
}