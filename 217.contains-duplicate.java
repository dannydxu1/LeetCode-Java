/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //slow solution: O(N^2), use nested for loop and compare each possible pair
        //fast approach: O(NlogN), since order doesn't matter, sort the array, and get it in one go
        Arrays.sort(nums);
        Set<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++ ) {
            int num = nums[i];
            if (hs.contains(num))
                return true;
            hs.add(num);
        }
        return false;
    }
}
// @lc code=end

