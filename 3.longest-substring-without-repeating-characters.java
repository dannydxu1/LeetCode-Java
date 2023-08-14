/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.*;
class Solution {
    // abbcd | 3 
    // ababcd | 4
    // abcabcbb | 3 
    public int lengthOfLongestSubstring(String s) {
        //sliding window approach, only interate across once
        HashSet<Character> hs = new HashSet<Character>();
        int max = 0;
        int lptr = 0;
        int rptr = 0;
        int len = s.length();
        while (rptr < len){
            char r = s.charAt(rptr);
            if (hs.contains(r) == false){
                hs.add(s.charAt(rptr));
                max = Math.max(rptr-lptr+1, max);
                rptr++;
            } else {
                while (lptr < rptr && hs.contains(r) == true){
                    hs.remove(s.charAt(lptr));
                    lptr++;
                }
            }
        }
        return max;
    }

    public int slowApproach(String s) {
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

