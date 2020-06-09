// 985. 查询后的偶数和
// #easy
// -

package _0985;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int i : A) {
            if (i % 2 == 0) sum += i;
        }
        List<Integer> list = new LinkedList<>();
        for (int[] q : queries) {
            if (A[q[1]] % 2 == 0) sum -= A[q[1]];
            A[q[1]] += q[0];
            if (A[q[1]] % 2 == 0) sum += A[q[1]];
            list.add(sum);
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for (int val : list) ans[i++] = val;
        return ans;
    }
}