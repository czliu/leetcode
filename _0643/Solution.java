// 0643. 子数组最大平均数 I
// #easy
// -

package _0643;

public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i=0;i<k;++i) {
            sum += nums[i];
        }
        long max = sum;
        if (nums.length == k) return (double)max / k;
        for (int i=k;i<nums.length;++i) {
            sum = sum + nums[i] - nums[i-k];
            if (sum > max) max = sum;
        }
        return (double)max / k;
    }
    
}