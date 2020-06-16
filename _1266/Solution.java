// 1266. 访问所有点的最小时间
// #easy
// -

package _1266;

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        int[] pre = points[0];
        for (int[] cur : points) {
            ans += Math.max(Math.abs(cur[0]-pre[0]), Math.abs(cur[1]-pre[1]));
            pre = cur;
        }
        return ans;
    }
}
