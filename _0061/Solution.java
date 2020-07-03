// 61. 旋转链表
// #medium
// -

package _0061;

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        int len = 1;
        while (head.next != null) {
            ++len;
            head = head.next;
        }
        head.next = dummyHead.next;
        int newHeadPos = len - k % len;
        int count = 1;
        head = dummyHead.next;
        ListNode tail = new ListNode(0);
        while (count <= newHeadPos) {
            ++count;
            tail = head;
            head = head.next;
        }
        tail.next = null;
        return head;
    }
}
