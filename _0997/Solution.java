// 997. 找到小镇的法官
// #easy
// -

package _0997;

class Solution {
    public int findJudge(int N, int[][] trust) {
        int[][] a = new int[N][2]; // a[][0] trust others count, a[][1] be trust count
        for (int i=0;i<trust.length;++i) {
            ++a[trust[i][0]-1][0];
            ++a[trust[i][1]-1][1];
        }
        for (int i=0;i<N;++i) {
            if (a[i][0] == 0 && a[i][1] == N-1) return i+1;
        }
        return -1;
    }
}