// 989. 数组形式的整数加法
// #easy
// -

package _0989;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int i = A.length - 1;
        int carry = 0;
        List<Integer> ans = new LinkedList<>();
        while (i >= 0 && K > 0) {
            int tmp = A[i] + (K % 10) + carry;
            K = K / 10;
            A[i] = tmp % 10;
            carry = tmp / 10;
            --i;
        }
        if (K == 0) {
            if (carry == 0) {
                for (int a : A) ans.add(a);
                return ans;
            } else {
                while (i >= 0) {
                    int tmp = A[i] + carry;
                    A[i] = tmp % 10;
                    carry = tmp / 10;
                    --i;
                }
                if (carry != 0) ans.add(carry);
                for (int a : A) ans.add(a);
                return ans;
            }
        } else if (K > 0) {
            K += carry;
            Stack<Integer> stack = new Stack<>();
            while (K > 0) {
                stack.push(K % 10);
                K = K / 10;
            }
            while (!stack.isEmpty()) ans.add(stack.pop());
            for (int a : A) ans.add(a);
            return ans;
        }
        return ans;
    }
}