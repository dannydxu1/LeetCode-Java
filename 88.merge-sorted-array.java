/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * 1 2 3 5 0
         * 1 2 3 5 0
         * 2 6
         * curr = 2, lastVal = 0, int nextLastVal = 0
         */
        print(nums1);
         for (int i = 0; i < m; i++){
            int curr = nums2[i];
            System.out.println("curr:"+curr);
            boolean numInserted = false;
            int lastVal = 0;
            for (int j = 0; j < n; j++ ){
                   System.out.println(nums1[j]);
                    if (numInserted){
                        int nextLastVal = nums1[j];
                        nums1[j] = lastVal;
                        lastVal = nextLastVal;
                    }
                if (curr < nums1[j] ){
                    //insert curr
                    lastVal = nums1[j];
                    nums1[j] = curr;
                    numInserted = true;
                }
            }
            print(nums1);
         }
    }
    
    public static void print (int[] arr){
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
// @lc code=end

