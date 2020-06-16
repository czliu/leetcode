// 1295. 统计位数为偶数的数字
// #easy
// -

package _1295;

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int k : nums) {
            if ((int)Math.log10(k) % 2 == 1) ++ans;
        }
        return ans;
    }
}
