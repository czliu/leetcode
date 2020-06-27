// 209. 长度最小的子数组
// #easy
// -

package _0209;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0;
        int n = nums.length;
        if (n == 0) return 0;
        int sum = nums[0];
        int ans = 0;
        while (right < n) {
            if (sum < s) {
                if (right+1 < n) {
                    ++right;
                    sum += nums[right];
                }
                else break;
            }
            else if (sum >= s) {
                if (ans == 0) ans = right - left + 1;
                else ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                ++left;
                if (left > right) {
                    ++right;
                    if (right < n) sum += nums[right];
                }
            }
        }
        return ans;
    }
}