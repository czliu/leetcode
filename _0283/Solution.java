// 0283. move zeroes
// #easy
// 

package _0283;

public class Solution {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 0) return;
        int count = 0;
        for (int i=0;i<n;++i){
            if (nums[i] != 0) {
                if (i != count) {
                    int tmp = nums[count];
                    nums[count] = nums[i];
                    nums[i] = tmp;
                }
                ++count;
            }
        }
    }
    
}