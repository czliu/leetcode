// 1464. 数组中两元素的最大乘积
// #easy
// -

package _1464;

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        for (int k : nums) {
            if (max1 == 0) max1 = k;
            else if (max2 == 0) {
                if (max1 >= k) max2 = k;
                else {
                    max2 = max1;
                    max1 = k;
                }
            }
            else {
                if (k >= max1) {
                    max2 = max1;
                    max1 = k;
                }
                else if (k > max2) max2 = k;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}