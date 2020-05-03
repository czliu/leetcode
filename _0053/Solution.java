//0053. maximum subarray
// **
// #easy #dp

package _0053;

public class Solution {

    public int maxSubArray(int[] nums) {
        int pre_sum = 0;
        int max_sum = nums[0];
        int cur_sum;
        for (int num : nums) {
            cur_sum = Math.max(num, pre_sum + num);
            max_sum = Math.max(cur_sum, max_sum);
            pre_sum = cur_sum;
        }
        return max_sum;
    }

}