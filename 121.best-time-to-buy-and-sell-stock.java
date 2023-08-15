/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        //l2,1,r4,0
        int lptr = 0;
        int rptr = 0;
        int max = 0;
        while (rptr < prices.length){
            if (prices[rptr] <  prices[lptr]) {
                lptr = rptr;
            } else {
                max = Math.max(prices[rptr]-prices[lptr], max);
                rptr++;
            }
        }
        return max;

    }
}
// @lc code=end

