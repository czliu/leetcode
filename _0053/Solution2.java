package _0053;

public class Solution2 {
    public int maxSubArray(int[] nums) {
        int[] a = new int[nums.length];
        for (int i=0;i<nums.length;++i) {
            if (i == 0) a[i] = nums[i];
            else if (a[i-1] + nums[i] > nums[i]) a[i] = a[i-1] + nums[i];
            else a[i] = nums[i];
        }
        int max = a[0];
        for (int i=0;i<a.length;++i) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }
}
