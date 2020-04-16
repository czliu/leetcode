// 0055. Jump game

package _0055;

public class Solution {

    public boolean canJump(int[] nums) {
        if (nums.length == 0 || nums == null) return false;
        int[] helper = new int[nums.length];
        helper[0] = 1;
        for (int i=0;i<nums.length;++i){
            if (helper[i] == 1){
                for (int j=0;j<=nums[i];++j) {
                    if (i+j >= nums.length) break;
                    else helper[i+j] = 1;
                }
            }
        }
        return (helper[nums.length-1] == 0)? false : true;
    }
}