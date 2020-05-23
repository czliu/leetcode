// 0661. 图片平滑器
// #easy
// -

package _0661;

public class Solution {
    
    public int[][] imageSmoother(int[][] M) {
        int[] deltaR = new int[] {-1,-1,-1, 0, 0, 0, 1, 1, 1};
        int[] deltaC = new int[] {-1, 0, 1,-1, 0, 1,-1, 0, 1};
        int r = M.length, c = M[0].length;
        int[][] ans = new int[r][c];
        for (int i=0;i<r;++i){
            for (int j=0;j<c;++j){
                int sum = 0, count = 0;
                for (int k=0;k<9;++k){
                    int curR = i+deltaR[k], curC = j+deltaC[k];
                    if (curR>=0 && curR<r && curC>=0 && curC<c) {
                        sum += M[curR][curC];
                        ++count;
                    }
                }
                ans[i][j] = sum / count;
            }
        }
        return ans;
    }
}