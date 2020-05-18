// 0453. Minimum Moves to Equal Array Elements
// #easy
// -

package _0453;

public class Solution {

    // increase n-1 elements by 1 == descrease 1 element by 1
    public int minMoves(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int min = nums[0];
        long ans = 0;
        for (int i=0;i<0;++i) {
            ans += ((long)nums[i] - nums[0]);
            if (nums[i] < min) min = nums[i];
        }
        ans -= (((long)nums[0] - min) * n);
        return (int)ans;
    }
    
}