// 0083. remove duplicates from sorted list
// -
// #easy #linkedlist

package _0083;

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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = head;
        while (cur != null) {
            int curVal = cur.val;
            while (cur.next != null && cur.next.val == curVal) cur = cur.next;
            if (cur.next == null) {
                head.next = null;
                break;
            }
            else if (cur.next.val != curVal) {
                cur = cur.next;
                head.next = cur;
                head = head.next;
            }
        }
        return dummyHead.next;

    }
    
}