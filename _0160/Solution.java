// 0151. Reverse words in a string
// *
// #easy #linkedlist #hashmap
// time : O(m+n), space: O(m) or O(n)

package _0160;

import java.util.*;
import structure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode dummyHeadA = new ListNode(0);
        ListNode dummyHeadB = new ListNode(0);
        dummyHeadA.next = headA;
        dummyHeadB.next = headB;
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                ListNode helper = new ListNode(0);
                helper.next = headB;
                headA = dummyHeadA.next;
                headB = dummyHeadB.next;
                return helper.next;
            }
            headB = headB.next;
        }
        return null; 
    }

}