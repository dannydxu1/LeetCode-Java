/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int area = 0;
        int l = 0;
        while (l<height.length){
            int r = l+1;
            int bestRInd = r;
            int rHeight = height[r];
            int bestRHeight = rHeight;
            while  (height[l] > rHeight ){
                if (rHeight >= bestRHeight){
                    bestRHeight = rHeight;
                    bestRHeight = r;
                }
                r++;
            }
            if ( height[l] <= height[r]) { 
                System.out.println("Found higher right height");
                area += ((r-l+1)*(Math.min(height[l], height[r])));
                l=r;
            } else { 
                System.out.println("No higher right height exists, settling for current max");
                 area += ((bestRInd-l+1)*(Math.min(height[l], height[bestRInd])));
            }
        }
        return area;

        }
        
    }
// @lc code=end

