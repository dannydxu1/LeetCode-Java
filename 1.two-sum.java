/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int complement = target - curr;
            if (numsMap.containsKey(complement)) {
                return new int[] {numsMap.get(complement), i};
            } else {
                numsMap.put(curr, i);
            }
        }

        return new int[] {};
    }
}

// @lc code=end

