// 0268. missing number
// *
// #easy #bit 

package _0268;

public class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int num : nums) ans = ans ^ num;
        for (int i=0; i<=n; ++i) {
            ans = ans ^ i;
        }
        return ans;
    }

}