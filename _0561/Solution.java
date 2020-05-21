// 0561. array partition I
// #easy
// -

package _0561;

import java.util.*;

public class Solution {

    public int arrayPairSum(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i <= nums.length / 2 - 1; ++i) {
            ans += nums[2*i];
        }
        return ans;
    }
    
}