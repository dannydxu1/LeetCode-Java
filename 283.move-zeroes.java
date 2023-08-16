/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        // 1 a0 0 b2
        //ensures a is on zero while b is always on non zero before swapping occurs
        //each pointer is attracted to their respective sides
        int p1 = 0;
        int p2 = 0;
        while (p2 < nums.length){
            if (nums[p2] != 0){ //b!=0
                //swap
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2++;
            } else {
                p2 ++;
            }
        }
    }
}
// @lc code=end

