/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lptr = 0;
        int rptr = 0;
        while (rptr < prices.length) {
            if (prices[lptr] >= prices[rptr]) {
                lptr = rptr;
                rptr ++;
            } else {
                max = Math.max((prices[rptr] - prices[lptr]), max);
                rptr++;
            }

        }
        return max;
    }
}
// @lc code=end

