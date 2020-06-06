// 888. 公平的糖果交换
// #easy
// -

package _0888;

import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        long sumA =0, sumB = 0;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<A.length;++i) {
            set.add(A[i]);
            sumA += A[i];
        }
        for (int i=0;i<B.length;++i) {
            sumB += B[i];
        }
        int diff = (int)(sumA - sumB);
        for (int i=0;i<B.length;++i) {
            if (set.contains(B[i] + diff/2)) return new int[] {B[i] + diff/2, B[i]};
        }
        return new int[2];
    }
}