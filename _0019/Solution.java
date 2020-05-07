// 0019. remove Nth node from end of list
// -
// #medium #linkedlist

package _0019;

import structure.ListNode;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            ++len;
        }
        if (n > len) return dummyHead.next;
        head = dummyHead.next;
        ListNode pre = dummyHead;
        while (n < len) {
            pre = head;
            head = head.next;
            --len;
        }
        pre.next = head.next;
        return dummyHead.next;
    }
    
}