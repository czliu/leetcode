// 0203. remove linked list elements
// #easy #linkedlist
// -

package _0203;

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
                head = head.next;
            }
            else {
                pre = head;
                head = head.next;
            }
        }
        return dummyHead.next;
    }
}