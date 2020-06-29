// 剑指 Offer 09. 用两个栈实现队列
// #easy
// -

package offer09;

import java.util.Stack;

class CQueue {

    Stack<Integer> stack;
    Stack<Integer> stack2;

    public CQueue() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack.isEmpty()) return -1;
            else {
                while (!stack.isEmpty()) {
                    stack2.push(stack.pop());
                }
                return stack2.pop();
            }
        }
        return stack2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */