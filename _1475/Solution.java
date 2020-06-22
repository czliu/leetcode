// 1475. 商品折扣后的最终价格
// #easy
// -

package _1475;

import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<prices.length;++i) {
            if (i == 0) stack.push(0);
            else if (prices[i] > prices[stack.peek()]) stack.push(i);
            else {
                while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                    int cur = stack.pop();
                    prices[cur] -= prices[i];
                }
                stack.push(i);
            }
        }
        return prices;
    }
}