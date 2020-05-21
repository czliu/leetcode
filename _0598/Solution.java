// 0598. range addition II
// #easy
// -

package _0598;

public class Solution {

    public int maxCount(int m, int n, int[][] ops) {
        int r = ops.length;
        if (r == 0) return m * n;
        if (r == 1) return ops[0][0] * ops[0][1];
        int minR = ops[0][0], minC = ops[0][1];
        for (int i = 1;i<r;++i){
            minR = Math.min(minR, ops[i][0]);
            minC = Math.min(minC, ops[i][1]);
        }
        return minR * minC;
    }
    
}