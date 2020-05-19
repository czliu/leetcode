// 0485. max consecutive ones
// #easy
// -

package _0485;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int curLen = 0;
        int pre = 0;
        for (int i=0;i<nums.length;++i) {
            if (nums[i] == 1) {
                ++curLen;
                pre = 1;
            }else if (nums[i] == 0 && pre == 1) {
                ans = Math.max(ans, curLen);
                curLen = 0;
                pre = 0;
            }
            else continue;
        }
        if (curLen > 0) ans = Math.max(ans, curLen);
        return ans;
    }
    
}