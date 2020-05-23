// 682. 棒球比赛
// #easy
// -

package _0682;

import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        int last2 = 0, last1 = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<ops.length;++i){
            if (ops[i].equals("+")) {
                int cur = last2 + last1;
                stack.push(cur);
                last2 = last1;
                last1 = cur;
            }
            else if (ops[i].equals("D")) {
                int cur = last1 * 2;
                stack.push(cur);
                last2 = last1;
                last1 = cur;
            }
            else if (ops[i].equals("C")) {
                stack.pop();
                if (stack.isEmpty()) {
                    last1 = 0;
                    last2 = 0;
                } else {
                    last1 = stack.pop();
                    if (stack.isEmpty()) {
                        last2 = 0;
                        stack.push(last1);
                    } else {
                        last2 = stack.peek();
                        stack.push(last1);
                    }
                }
            }
            else {
                int cur = Integer.valueOf(ops[i]);
                stack.push(cur);
                last2 = last1;
                last1 = cur;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.calPoints(new String[] {"5","2","C","D","+"});
        System.out.println(ans);
    }
}