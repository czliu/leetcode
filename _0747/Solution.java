// 747. 至少是其他数字两倍的最大数
// #easy
// -

package _0747;

class Solution {

    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        int max1 = -1, max2 = -1;
        int ind1 = -1;
        for (int i=0;i<n;++i) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                ind1 = i;
            }
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if (max1 >= max2 * 2) return ind1;
        else return -1;
    }

}