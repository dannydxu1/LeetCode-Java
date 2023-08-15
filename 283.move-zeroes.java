/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for ( int i = 0 ; i < nums.length; i++){
            if (nums[i] != 0){
                continue;
            } else {
                System.out.println(nums[i]);
                int index = i;
                while (index < nums.length - 1){
                    int lval = nums[index];
                    int temp = nums[index+1];
                    int rval = lval;
                    lval = temp;
                    nums[index] = lval;
                    nums[index+1] = rval;
                    index++;
                    printArr(nums);
                }
            }
        }
    }

    public void printArr(int[] arr){
        for (int i = 0 ; i < arr.length ;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
// @lc code=end

