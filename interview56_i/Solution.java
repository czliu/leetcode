// interview56_i. 数组中数字出现的次数

// #medium #bit 
// #review

package interview56_i;

public class Solution {

    public int[] singleNumbers(int[] nums) {
        int xor = 0, len = nums.length;
        for (int num : nums)
            xor ^= num;
        int diff = xor & (-xor);
        int x = 0;
        for (int num : nums) {
            if ((diff & num) != 0)
                x ^= num;
        }
        return new int[]{x, xor ^ x};
    }
}