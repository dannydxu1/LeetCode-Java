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
        if (s.length() <= 1)
            return s.length();
        while (rptr < s.length()-1) {
            char left = s.charAt(lptr);
            char right = s.charAt(rptr);
            System.out.println("left: "+left+" right: "+right);
            if (hs.contains(right) == false) {
                System.out.println("added "+right);
                hs.add(right);
                max = Math.max(rptr - lptr + 1, max);
                rptr++;
            } else {
                hs.clear();
                System.out.println("cleared cleared of duplicate "+right);
                lptr++;
                while (s.charAt(lptr)==s.charAt(lptr+1) && lptr<s.length()-1){
                    lptr++;
                }
                rptr = lptr++;
                System.out.println("left index: "+lptr+" right index: "+rptr);
                hs.add(left);
            }
        }
        return max;
    }
}
// @lc code=end

