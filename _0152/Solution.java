// 0152. maximum product subarray
// #medium #dp
// *

package _0152;

public class Solution {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dpmax1 = new int[n];
        int[] dpmax0 = new int[n];
        int[] dpmin1 = new int[n];
        for (int i=1;i<n;++i) {
            if (i == 1) {
                dpmax1[1] = Math.max(nums[0]*nums[1], nums[1]);
                dpmax0[1] = nums[0];
                dpmin1[1] = Math.min(nums[0]*nums[1], nums[1]);
            }
            else if (i > 1) {
                dpmax1[i] = Math.max(Math.max(dpmax1[i-1]*nums[i], dpmin1[i-1]*nums[i]), nums[i]);
                dpmax0[i] = Math.max(dpmax0[i-1], dpmax1[i-1]);
                dpmin1[i] = Math.min(Math.min(dpmax1[i-1]*nums[i], dpmin1[i-1]*nums[i]), nums[i]);
            }
        }
        return Math.max(dpmax1[n-1], dpmax0[n-1]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.maxProduct(new int[] {2,3,-2,4});
        System.out.println(ans);
    }
    
}