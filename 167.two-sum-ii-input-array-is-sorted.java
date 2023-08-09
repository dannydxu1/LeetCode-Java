/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length-1; i++) {
            int indexA = i;
            for (int j = i + 1; j < numbers.length; j++) {
                int indexB = j;
                if (numbers[indexA] + numbers[indexB] == target) {
                    return new int[] { indexA + 1, indexB + 1 };
                }
            }
        }
        return new int[] {};
    }
}
// @lc code=end

