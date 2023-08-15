/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin= nums[0];
        int max = nums[0];
        for (int i = 1; i<nums.length; i++){
            int tempMin = Math.min(nums[i], Math.min(nums[i] * currMax, nums[i] * currMin));
            int tempMax = Math.max(Math.max(nums[i], nums[i] * currMax), nums[i] * currMin);
            currMin = tempMin;
            currMax = tempMax;
            max = Math.max(currMax, max);
        }
        return max;
    }
}
// @lc code=end
