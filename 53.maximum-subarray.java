/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
      /**
       * -2,1,-3,4,-1,2,1,-5,4
       * basically just need to figure out whether to stop or keep going
       * cant go backwards
       * curr = 1
       * max = 1
       * 
       */
      int curr = nums[0];
      int max = curr;
      for (int i = 1; i < nums.length; i++){
        int temp = nums[i];
        if (temp+curr < temp){
            curr = temp;
        } else {
            curr += temp;
        }
            max = Math.max(max, curr);
    }
      return max;
    }
}
// @lc code=end

