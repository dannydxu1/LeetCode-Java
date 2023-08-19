/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
       int lptr = 0;
       int rptr = s.length-1;
       while (lptr < rptr) {
        char temp = s[lptr];
        s[lptr] = s[rptr];
        s[rptr] = temp;
        lptr ++;    
        rptr --;
       }
    }
}
// @lc code=end

