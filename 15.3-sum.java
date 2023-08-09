/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length-2 ; i++) {
            int complement = 0 - nums[i];
            int lptr = i + 1;
            int rptr = nums.length - 1;

            while (lptr < rptr) {
                int sum = nums[lptr] + nums[rptr];
                if (sum > complement) {
                    rptr--;
                } else if (sum < complement) {
                    lptr++;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[lptr]);
                    temp.add(nums[rptr]);
                    ans.add(temp);
                    while (lptr < rptr && nums[lptr] == temp.get(1))
                        lptr++;
                    while (lptr < rptr && nums[rptr] == temp.get(2))
                        rptr--;
                }
            }
            while (nums[i] == nums[i + 1] && i<nums.length-2)
                i++;
        }
       return ans;

    }
}
// @lc code=end

