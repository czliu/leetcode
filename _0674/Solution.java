// 674. 最长连续递增序列
// #easy
// -

package _0674;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int ans = 0, cur = 0;
        for (int i=0;i<n;++i) {
            if (i == 0) {
                ++cur;
                ans = cur;
            }
            else if (nums[i] > nums[i-1]) ++cur;
            else if (nums[i] <= nums[i-1]) {
                if (cur != 1) {
                    ans = Math.max(ans, cur);
                    cur = 1;
                }
            }
            if (i == n-1) ans = Math.max(ans, cur);
            //System.out.println(ans);
        }
        return ans;

    }
}