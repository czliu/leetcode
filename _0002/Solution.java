// 0002. Add two numbers
// -
// #medium #linkedlist

package _0002;

import structure.ListNode;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode sum = new ListNode(0);
        dummyHead = sum;
        int cur = 0, carry = 0;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                cur = l2.val + carry;
                l2 = l2.next;
            }
            else if (l2 == null) {
                cur = l1.val + carry;
                l1 = l1.next;
            }
            else {
                cur = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            ListNode curSum = new ListNode((cur >= 10)? cur - 10 : cur);
            carry = (cur >= 10)? 1 : 0;
            sum.next = curSum;
            sum = sum.next;
        }
        if (carry == 1) {
            ListNode curSum = new ListNode(1);
            sum.next = curSum;
        }
        return dummyHead.next;
    }
}
