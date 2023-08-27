/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        /**
         *      COLS
         * ROWS 1234
         *      5678
         *      9101112
         */
        int top = 0; int bottom = matrix.length-1; int left = 0; int right=matrix[0].length-1;
        //top/bottom are rows, left/right are columns
        while (top <= bottom && left <= right){
            int i = left; //iterate from left to right on top boundary
            while (i <= right){
                System.out.print(matrix[top][i]+",");
                ret.add(matrix[top][i]);
                i++;
            }
            top++;
            i = top; //iterate top to bottom on right boundary
            while (i <= bottom){
                System.out.print(matrix[i][right]+",");
                ret.add(matrix[i][right]);
                i++;
            }
            right --;
            if (top > bottom || left > right) return ret;
            i = right; //iterate right to left on bottom boundary
              while (i >= left){
                System.out.print(matrix[bottom][i]+",");
                ret.add(matrix[bottom][i]);
                i--;
            }
            bottom --;
            i = bottom; //iterate bottom to top on left boundary
              while (i >= top){
                System.out.print(matrix[i][left]+",");
                ret.add(matrix[i][left]);
                i--;
            }
            left ++;
        }

        return ret;
    }
}
// @lc code=end

