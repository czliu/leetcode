// 1413. 逐步求和得到正数的最小值
// #easy
// -

package _1413;

class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int sum = nums[0], min = nums[0];
        for (int i=1;i<n;++i) {
            sum += nums[i];
            if (nums[i] < 0) min = Math.min(min, sum);
        }
        if (min >= 0) return 1;
        return 1 - min;
    }
}
