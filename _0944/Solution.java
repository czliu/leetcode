// 944. 删列造序
// #easy
//

package _0944;

class Solution {
    public int minDeletionSize(String[] A) {
        if (A.length <= 1) return 0;
        int ans = 0;
        for (int i=0;i<A[0].length();++i) {
            for (int j=0;j<A.length-1;++j) {
                if (A[j].charAt(i) - A[j+1].charAt(i) > 0) {
                    ++ans;
                    break;
                }
            }
        }
        return ans;
    }
}