/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        /**
         * Initially thought the goal is to check for proper amount of left and right matching brackets, then I realized order matters
         * need to add the complement bracket when iterating across the array in for loop
         * order matters. it is last in first out - use a stack
         * track the last char added - stack.peek()
         * remove when matches occur - stack.pop()
         */
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length() ; i++){
            char curr = s.charAt(i);

            //if left char, add the matching complement normally
            if (curr == '{') {
                st.add('}');
            }
             if (curr == '(') {
                st.add(')');
            }
             if (curr == '[') {
               st.add(']');
            }
            //if right char, then we check the last char added
            if (curr == ']' || curr == ')' || curr == '}'){
                if (st.size() ==0 ) return false;
                char past = st.peek();
                if (past != curr) {
                   return false;
                } else {
                    st.pop();
                }
               
            }
        }
        if (st.size() !=0 ) return false;
        return true;
    }
}
// @lc code=end

