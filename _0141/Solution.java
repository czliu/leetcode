// 0141. linked list cycle
// #easy #2pointers
// *

package _0141;

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
    
    /* space: O(n)
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            else set.add(head);
            head = head.next;
        }
        return false;
    }
    */

    // space: O(1)
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}