// 0206. Reverse a singly linked list
// LinkedList, Iteration 迭代

package _0206;

import structure.ListNode;

class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        else {
            ListNode last = head;
            ListNode curr = last.next;
            while (curr != null) {
                last.next = curr.next;
                curr.next = head;
                head = curr;
                curr = last.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        
    }
}
