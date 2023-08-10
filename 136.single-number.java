/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums ) {
            res ^= num;
        }
        return res;
    }
}
// @lc code=end

