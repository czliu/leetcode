// 1232. 缀点成线
// #easy
// -

package _1232;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n <= 2) return true;
        for (int i=2;i<n;++i) {
            if (check(coordinates[0], coordinates[1], coordinates[i]) == false) return false;
        }
        return true;
    }

    private boolean check(int[] a, int[] b, int[] c) {
        return (((b[0]-a[0]) * (c[1]-a[1]) == (b[1]-a[1]) * (c[0]-a[0])));
    }
}