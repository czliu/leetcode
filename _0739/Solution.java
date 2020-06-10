// 739. 每日温度
// #medium
// -

package _0739;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int[] ans = new int[T.length];
        for (int i=0;i<T.length;++i) {
            if (temp.isEmpty() || temp.peek() >= T[i]) {
                temp.push(T[i]);
                index.push(i);
            } else {
                while (!temp.isEmpty() && temp.peek() < T[i]) {
                    temp.pop();
                    int pre = index.pop();
                    ans[pre] = i - pre;
                }
                temp.push(T[i]);
                index.push(i);
            }
        }
        while (!index.isEmpty()) {
            ans[index.pop()] = 0;
        }
        return ans;
    }
}
