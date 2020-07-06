// 82. 删除排序链表中的重复元素 II
// #medium
// -

package _0082;

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode pre = new ListNode(0);
        if (head == null) return null;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                int tmp = head.val;
                while (head != null && head.val == tmp) head = head.next;
            }
            else { // head.next == null || head.next != null
                if (dummyHead.next == null) {
                    dummyHead.next = new ListNode(head.val);
                    pre = dummyHead.next;
                }
                else {
                    pre.next = new ListNode(head.val);
                    pre = pre.next;
                }
                head = head.next;
            }
        }
        return dummyHead.next;
    }
}