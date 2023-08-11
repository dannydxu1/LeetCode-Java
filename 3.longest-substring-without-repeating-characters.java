/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int max = 0;
        int lptr = 0;
        int rptr = 0;
        for (; lptr <s.length(); lptr++) {
            rptr = lptr;
            while (rptr<s.length() && hs.contains(s.charAt(rptr)) == false) {
                hs.add(s.charAt(rptr));
                max = Math.max(max, rptr-lptr+1);
                rptr++;
            }
            hs.clear();
        }
        return max;
    }

}
// @lc code=end

