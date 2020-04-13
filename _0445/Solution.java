// 0445. Add two numbers II
// stack, LinkedList

package _0445;

import structure.ListNode;
import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        Stack<Integer> s = new Stack<>();
        while (!s1.isEmpty() || !s2.isEmpty()){
            int temp1 = s1.isEmpty() ? 0 : s1.pop();
            int temp2 = s2.isEmpty() ? 0 : s2.pop();
            int sum = temp1 + temp2 + carry;
            if (sum >= 10) {
                carry = 1;
                s.push(sum%10);
            }
            else {
                carry = 0;
                s.push(sum);
            }
        }
        if (carry == 1) s.push(1);
        ListNode ans, cur;
        if (s.isEmpty()) return null;
        ans = new ListNode(s.pop());
        cur = ans;
        while (!s.isEmpty()){
            cur.next = new ListNode(s.pop());
            cur = cur.next;
        }
        return ans;
    }
}