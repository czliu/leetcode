// 86. 分隔链表
// #medium
// -

package _0086;

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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode lessPre = new ListNode(0);
        ListNode moreOrEqual = new ListNode(0);
        ListNode moreOrEqualPre = new ListNode(0);
        if (head == null) return null;
        while (head != null) {
            if (head.val < x) {
                if (less.next == null) {
                    less.next = new ListNode(head.val);
                    lessPre = less.next;
                } else {
                    lessPre.next = new ListNode(head.val);
                    lessPre = lessPre.next;
                }
            } else {
                if (moreOrEqual.next == null) {
                    moreOrEqual.next = new ListNode(head.val);
                    moreOrEqualPre = moreOrEqual.next;
                } else {
                    moreOrEqualPre.next = new ListNode(head.val);
                    moreOrEqualPre = moreOrEqualPre.next;
                }
            }
            head = head.next;
        }
        if (less.next == null) less.next = moreOrEqual.next;
        else lessPre.next = moreOrEqual.next;
        return less.next;
    }
}