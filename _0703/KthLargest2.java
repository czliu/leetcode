// 0703.数据流中的第K大元素
// #easy
// -

package _0703;

import java.util.*;

// too much time consuming

class KthLargest2 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    int k = 0;

    public KthLargest2(int k, int[] nums) {
        this.k = k;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < k; ++i) {
            if (n - i - 1 >= 0)
                stack.push(nums[n - i - 1]);
        }
    }

    public int add(int val) {
        if (stack.size() == k) {
            int kth = stack.peek();
            if (val <= kth)
                return kth;
            else {
                stack.pop();
                while (!stack.isEmpty() && val > stack.peek()) {
                    stack2.push(stack.pop());
                }
                stack.push(val);
                while (!stack2.isEmpty()) {
                    stack.push(stack2.pop());
                }
            }
            return stack.peek();
        } else {// stack.size() == k - 1
            while (!stack.isEmpty() && val > stack.peek()) {
                stack2.push(stack.pop());
            }
            stack.push(val);
            while (!stack2.isEmpty()) {
                stack.push(stack2.pop());
            }
            return stack.peek();
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */