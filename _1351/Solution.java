// 1351. 统计有序矩阵中的负数
// #easy
// -

package _1351;

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int[] k : grid) ans += count(k);
        return ans;
    }

    private int count(int[] k) {
        int n = k.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (k[mid] >= 0) left = mid+1;
            else { // k[mid] < 0
                if (mid == 0) return n;
                else if (k[mid-1] < 0) right = mid-1;
                else if (k[mid-1] >= 0) return n-mid;
            }
        }
        return 0;
    }
}