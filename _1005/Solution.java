// 1005. K 次取反后最大化的数组和
// #easy
// -

package _1005;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        int sum = 0;
        int min_abs = Math.abs(A[0]);
        Stack<Integer> stack = new Stack<>();
        for (int i : A) {
            sum += i;
            if (i < 0) stack.push(i);
            min_abs = Math.min(Math.abs(i), min_abs);
        }
        int[] negative = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            negative[i] = stack.pop();
            ++i;
        }
        if (K <= negative.length) {
            Arrays.sort(negative);
            i = 0;
            while (K > 0) {
                sum += (negative[i] * (-2));
                --K;
                ++i;
            }
        } else { // K > negative.length
            for (int a : negative) sum += (a * (-2));
            if ((K - negative.length) % 2 == 1) {
                sum += (min_abs * (-2));
            }
        }
        return sum;
    }
}
