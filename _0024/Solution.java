// 0024. swap nodes in pairs
// -
// #medium #linkedlist

package _0024;

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

    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre, cur, tmp, follow;
        pre = dummyHead;
        cur = head;
        while (cur != null) {
            if (cur.next == null) break;
            else {
                tmp = cur.next;
                follow = tmp.next;
                pre.next = tmp;
                tmp.next = cur;
                cur.next = follow;
                pre = cur;
                cur = follow;
            }
        }
        return dummyHead.next;

    }
    
}