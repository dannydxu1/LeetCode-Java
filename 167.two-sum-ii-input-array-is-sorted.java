/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr =0;
        int rightPtr = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            int sum = numbers[leftPtr] + numbers[rightPtr];
            if (sum > target) {
                rightPtr--;
            } else if (sum < target) {
                  leftPtr++;
              } else {
                  return new int[] { leftPtr+1, rightPtr+1};
            }
        }
        return new int[] {};
    }
}
// @lc code=end

