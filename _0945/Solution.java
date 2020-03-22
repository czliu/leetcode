// 0945. minimum increment to make array unique

package _0945;

import java.util.*;

class Solution {

    public int minIncrementForUnique(int[] A) {
        if (A.length <= 1) return 0;
        Arrays.sort(A);
        int ans = 0;
        for (int i=1;i<A.length;i++){
            if (A[i] <= A[i-1]) {
                ans += A[i-1] - A[i] + 1;
                A[i] = A[i-1] + 1;
            }    
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {2,1,1,1};
        int ans = s.minIncrementForUnique(A);
        System.out.println(ans);
    }
}
