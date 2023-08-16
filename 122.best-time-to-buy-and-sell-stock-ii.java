/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
       /**
        * Buy on Day 1
        Go to Day 2
        Sell Day 1's Stock (7-7=0) - Essentially cancels out the purchase
        Buy on Day 2 b/c 1<7
        Go to Day 3
        Sell because 5>1
        Buy on Day 3 because no stock
        Go to Day 4
        Sell Day 3's Stock becaue 3<5
        etc...
        maximize money by selling the moment you profit
        */
        int totalProfit = 0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++){
           int currPrice = prices[i]; //if cheaper entry point is found, enter
            if (currPrice < buyPrice){
                buyPrice = currPrice;
            } else {
                //currPrice > buyPrice, chance of profit
                totalProfit += (currPrice-buyPrice);
                buyPrice=currPrice;
            }
        }
        return totalProfit;
    }
}
// @lc code=end

