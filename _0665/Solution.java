// 0665. 非递减数列
// #easy
// *

package _0665;

public class Solution {

    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        if (n <= 2) return true;
        int count = 0;
        for (int i=0; i+1<n; ++i){
            if (nums[i] > nums[i+1]) {
                ++count;
                if (i-1>=0) {
                    if (nums[i-1] <= nums[i+1]) nums[i] = nums[i+1];
                    else if (nums[i-1] > nums[i+1]) nums[i+1] = nums[i];
                } else nums[i] = nums[i+1];
            }
            if (count > 1) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.checkPossibility(new int[] {2,3,3,2,4});
        System.out.println(ans);
    }
}