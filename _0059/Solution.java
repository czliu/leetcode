// 59. 螺旋矩阵 II
// #medium
// -

package _0059;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        int[] dir0 = new int[] {0,1, 0,-1};
        int[] dir1 = new int[] {1,0,-1, 0};
        int count = 0, dirIndex = 0;
        int[] cur = new int[] {0,0};
        ans[cur[0]][cur[1]] = 1;
        ++top;
        ++count;
        while (count < n * n) {
            if (dirIndex == 0 && cur[1] + dir1[dirIndex] > right) {
                ++dirIndex;
                --right;
                continue;
            }
            else if (dirIndex == 1 && cur[0] + dir0[dirIndex] > bottom) {
                ++dirIndex;
                --bottom;
                continue;
            }
            else if (dirIndex == 2 && cur[1] + dir1[dirIndex] < left) {
                ++dirIndex;
                ++left;
                continue;
            }
            else if (dirIndex == 3 && cur[0] + dir0[dirIndex] < top) {
                dirIndex = 0;
                ++top;
                continue;
            }
            cur[0] += dir0[dirIndex];
            cur[1] += dir1[dirIndex];
            ++count;
            ans[cur[0]][cur[1]] = count;
        }
        return ans;
    }
}
