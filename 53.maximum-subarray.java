/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], nums[i]+curr);
            max = Math.max(max, curr);
        }
        return max;
    }
}
// @lc code=end

/*
 * 1,2,-4,5
 * curruntSum = 5 vs 4
 * maxSum = 5
 */