/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int lptr = 0;
        int rptr=height.length-1;
        int max = 0;
        while (lptr < rptr) {
            int w = rptr-lptr;
            int h =  Math.min(height[rptr], height[lptr]);
            if ( height[rptr] == height[lptr]) {
                h = height[rptr];
            }
            int temp = w * h;
            if (temp > max){
                max = temp;
            }
            if (height[lptr] < height[rptr]) { 
                lptr ++;
            } else {
                rptr--;
            }
        }
        return max;
    }
}
// @lc code=end

