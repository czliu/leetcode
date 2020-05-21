// 0566. reshape the matrix
// #easy
// -

package _0566;

public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r1 = nums.length, c1 = nums[0].length;
        if (r1 * c1 != r * c) return nums;
        int[][] ans = new int[r][c];
        for (int i = 0;i < r1;++i) {
            for (int j = 0;j < c1;++j) {
                ans[(i*c1+j)/c][(i*c1+j)%c] = nums[i][j];
            }
        }
        return ans;
    }
    
}