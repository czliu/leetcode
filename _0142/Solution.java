// 0142. linked list cycle II
// #medium
// *
// related: 0141. Linked list cycle
// related: 0287

package _0142;

import structure.ListNode;
// import java.util.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        // space: O(1)
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);
        head = dummyHead.next;
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
        
    }
    
}