/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        /**
         * 7,l1,5,3,6,r4
         * max: 5
         */
        int lptr = 0;
        int rptr = 0;
        int max = 0;
        while (rptr < prices.length){
            if (prices[rptr] < prices[lptr]){
                lptr = rptr;
            } else{
                //right > left
                max = Math.max(prices[rptr]-prices[lptr], max);
            }
            rptr++;
        }
      
        return max;
    }
}
// @lc code=end

