// 0876. Middle of the linked list
// 单链表

package _0876;

import structure.ListNode;

class Solution {

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        if (count%2 == 0) count = count/2;
        else count = count/2;
        curr = head;
        while (count != 0) {
            count--;
            curr = curr.next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        ListNode curr = new ListNode(2);
        head.next = curr;
        ListNode last = new ListNode(3);
        curr.next = last;
        curr = last;
        last = new ListNode(4);
        curr.next = last;
        curr = last;
        last = new ListNode(5);
        curr.next = last;
        ListNode ans = s.middleNode(head);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
