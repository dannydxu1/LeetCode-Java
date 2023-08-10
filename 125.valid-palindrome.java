/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.length() <= 1) {
            return true;
        }
        System.out.println(s);
        char[] charr = s.toCharArray();
        int lptr = 0;
        int rptr = s.length()-1;
        while (lptr < rptr) {
            if (charr[lptr] != charr[rptr]) {
                 return false;
            } else {
                lptr++;
                rptr--;
            }
        }
        return true;
    }
}
// @lc code=end


