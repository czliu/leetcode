// 35. 搜索插入位置
// #easy
// -

package _0035;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return 0;
        for (int i=0;i<n;++i) {
            if (target <= nums[i]) return i;
        }
        return n;
    }
}